import java.util.stream.Stream;

public class Q3 {
    public static void main(String[] args) {
        // Generate a lazy sequence of prime numbers
        Stream<Long> primeStream = Stream.iterate(2L, n -> n + 1)
                                         .filter(Q3::isPrime);

        // Print the first 10 prime numbers from the lazy sequence
        primeStream.limit(10).forEach(System.out::println);
    }

    // Method to check if a number is prime
    private static boolean isPrime(long number) {
        if (number < 2) return false;
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
