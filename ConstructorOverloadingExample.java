/*
 * Explanation:
 * 
 * Objective: Write a Java program to demonstrate constructor overloading.
 * 
 * Steps:
 * 1. Create a class named `Rectangle` with multiple constructors to initialize its dimensions.
 * 2. Provide different constructors to initialize with default values, single side, and both sides.
 * 3. Create instances of the `Rectangle` class using different constructors and display their dimensions.
 */

public class ConstructorOverloadingExample {

    public static void main(String[] args) {
        // Step 3: Create instances of the Rectangle class using different constructors
        Rectangle defaultRectangle = new Rectangle();
        Rectangle square = new Rectangle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Display dimensions of each rectangle
        System.out.println("Default Rectangle:");
        defaultRectangle.displayDimensions();

        System.out.println("\nSquare:");
        square.displayDimensions();

        System.out.println("\nRectangle:");
        rectangle.displayDimensions();
    }
}

// Step 1: Create a class named `Rectangle`
class Rectangle {
    private int length;
    private int width;

    // Step 2: Constructor to initialize with default values
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Step 2: Constructor to initialize with a single side (square)
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Step 2: Constructor to initialize with both sides
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to display dimensions
    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}
