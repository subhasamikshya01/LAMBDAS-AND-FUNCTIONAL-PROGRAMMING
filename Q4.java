@FunctionalInterface
interface Shape {
    double area();

    default void printArea() {
        System.out.println("The area is: " + area());
    }
}
public class Q4 {
    public static void main(String[] args) {
        // Implementing the Shape interface for a circle
        Shape circle = () -> {
            double radius = 5.0; // example radius
            return Math.PI * radius * radius;
        };

        // Implementing the Shape interface for a square
        Shape square = () -> {
            double side = 4.0; // example side length
            return side * side;
        };

        // Implementing the Shape interface for a rectangle
        Shape rectangle = () -> {
            double length = 6.0; // example length
            double width = 3.0;  // example width
            return length * width;
        };

        // Print the area of each shape
        System.out.println("Circle:");
        circle.printArea();

        System.out.println("Square:");
        square.printArea();

        System.out.println("Rectangle:");
        rectangle.printArea();
    }
}
 