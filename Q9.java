import java.util.LinkedList;
import java.util.Queue;

public class Q9 {

    // Bounded buffer class
    static class BoundedBuffer {
        private final Queue<Integer> buffer;
        private final int capacity;

        public BoundedBuffer(int capacity) {
            this.buffer = new LinkedList<>();
            this.capacity = capacity;
        }

        // Synchronized method for producing items
        public synchronized void produce(int item) throws InterruptedException {
            while (buffer.size() == capacity) {
                wait(); // Wait until space is available
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notifyAll(); // Notify consumers that an item is available
        }

        // Synchronized method for consuming items
        public synchronized int consume() throws InterruptedException {
            while (buffer.isEmpty()) {
                wait(); // Wait until an item is available
            }
            int item = buffer.poll();
            System.out.println("Consumed: " + item);
            notifyAll(); // Notify producers that space is available
            return item;
        }
    }

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(5); // Buffer capacity of 5

        // Producer lambda
        Runnable producer = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.produce(i);
                    Thread.sleep(100); // Simulate time taken to produce an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Consumer lambda
        Runnable consumer = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consume();
                    Thread.sleep(150); // Simulate time taken to consume an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Create and start producer and consumer threads
        Thread producerThread1 = new Thread(producer);
        Thread producerThread2 = new Thread(producer);
        Thread consumerThread1 = new Thread(consumer);
        Thread consumerThread2 = new Thread(consumer);

        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();

        try {
            producerThread1.join();
            producerThread2.join();
            consumerThread1.join();
            consumerThread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
