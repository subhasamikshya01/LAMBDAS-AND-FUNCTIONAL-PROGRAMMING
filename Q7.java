import java.util.function.Function;

public class Q7 {
    public static void main(String[] args) {
        // Define a recursive lambda using a helper class to enable recursion
        Function<Integer, Integer> factorial = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                if (n == 0) {
                    return 1;
                } else {
                    return n * this.apply(n - 1);
                }
            }
        };

        // Test the recursive lambda to calculate factorial
        int number = 5;
        int result = factorial.apply(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
