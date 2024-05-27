public class Q8 {
    public static void main(String[] args) {
        // Define a lambda expression that implements the Runnable interface
        Runnable task = () -> System.out.println("Hello, CSW2!");

        // Create a thread using the lambda expression
        Thread thread = new Thread(task);

        // Start the thread
        thread.start();
    }
}
