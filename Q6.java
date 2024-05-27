import java.util.function.Function;

public class Q6 {
    public static void main(String[] args) {
        // Define a function that returns another function to calculate the square
        Function<Void, Function<Integer, Integer>> getSquareFunction = (Void v) -> (Integer x) -> x * x;

        // Get the square function
        Function<Integer, Integer> squareFunction = getSquareFunction.apply(null);

        // Demonstrate the use of the returned function to calculate squares
        int number1 = 5;
        int number2 = 10;
        int number3 = 15;

        System.out.println("The square of " + number1 + " is: " + squareFunction.apply(number1));
        System.out.println("The square of " + number2 + " is: " + squareFunction.apply(number2));
        System.out.println("The square of " + number3 + " is: " + squareFunction.apply(number3));
    }
}
