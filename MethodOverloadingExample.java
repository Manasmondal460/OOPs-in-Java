/*
 * Explanation:
 * 
 * Objective: Write a Java program to demonstrate method overloading.
 * 
 * Steps:
 * 1. Create a class named `Calculator` with overloaded methods to calculate the sum of different numbers of arguments.
 * 2. Provide methods to calculate the sum of two, three, and four integers.
 * 3. Create an instance of the `Calculator` class and demonstrate the use of overloaded methods.
 */

// Class named `Calculator`
public class MethodOverloadingExample {

    public static void main(String[] args) {
        // Step 3: Create an instance of the Calculator class
        Calculator calc = new Calculator();

        // Demonstrate the use of overloaded methods
        int sum1 = calc.sum(10, 20);
        int sum2 = calc.sum(10, 20, 30);
        int sum3 = calc.sum(10, 20, 30, 40);

        // Display the results
        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
        System.out.println("Sum of four numbers: " + sum3);
    }
}

// Step 1: Create a class named `Calculator`
class Calculator {

    // Step 2: Method to calculate the sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Step 2: Overloaded method to calculate the sum of three integers
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Step 2: Overloaded method to calculate the sum of four integers
    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

