@FunctionalInterface
interface Calculator {
    double operate(double a, double b);
}
public class Q1 {
    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;
        
        // Lambda expression for subtraction
        Calculator subtract = (a, b) -> a - b;
        
        // Lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;
        
        // Lambda expression for division
        Calculator divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        };

        // Testing the operations
        double num1 = 10.0;
        double num2 = 5.0;
        
        System.out.println("Addition: " + add.operate(num1, num2)); // Output: 15.0
        System.out.println("Subtraction: " + subtract.operate(num1, num2)); // Output: 5.0
        System.out.println("Multiplication: " + multiply.operate(num1, num2)); // Output: 50.0
        System.out.println("Division: " + divide.operate(num1, num2)); // Output: 2.0
    }
}
