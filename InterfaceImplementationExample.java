/*
 * Explanation:
 * 
 * Objective: Write a Java program to demonstrate the concept of interface implementation.
 * 
 * Steps:
 * 1. Create an interface named `Shape` with methods for calculating the area and perimeter.
 * 2. Create classes `Circle` and `Rectangle` that implement the `Shape` interface.
 * 3. Create instances of `Circle` and `Rectangle` and demonstrate the use of interface methods.
 */

// Step 1: Create an interface named `Shape`
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Step 2: Create a class named `Circle` that implements the `Shape` interface
class Circle implements Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement the calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Step 2: Create a class named `Rectangle` that implements the `Shape` interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implement the calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class InterfaceImplementationExample {

    public static void main(String[] args) {
        // Step 3: Create instances of Circle and Rectangle
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Demonstrate the use of interface methods
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
