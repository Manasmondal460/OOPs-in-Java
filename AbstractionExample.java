/*
 * Explanation:
 * 
 * 1. Abstract Class Vehicle:
 *    - The `Vehicle` class is an abstract class. It has one abstract method `start()` and one regular method `stop()`.
 *    - An abstract class cannot be instantiated, meaning you cannot create an object of the `Vehicle` class directly. It is meant to be subclassed.
 *    
 * 2. Concrete Classes Car and Bike:
 *    - The `Car` and `Bike` classes inherit from the `Vehicle` class.
 *    - Both classes provide their own implementation of the `start()` method, demonstrating how different vehicles start differently.
 *    - The `stop()` method from the `Vehicle` class is inherited by both `Car` and `Bike`, demonstrating code reuse.
 * 
 * 3. Main Method:
 *    - In the `main` method, we create instances of `Car` and `Bike`.
 *    - When we call the `start()` method on these instances, the specific implementation in the respective class is executed.
 *    - When we call the `stop()` method, the inherited method from the `Vehicle` class is executed.
 * 
 * Importance of Abstraction:
 * 
 * - Code Reusability: Abstract classes allow you to define methods that must be implemented in derived classes, ensuring that certain methods are always available in the subclasses.
 * - Improved Maintenance: By hiding implementation details and showing only necessary features, the code becomes easier to read and maintain.
 * - Flexibility: Abstract classes allow for a high level of flexibility. You can create different implementations of the abstract methods in different subclasses.
 */

// Abstract class Vehicle
abstract class Vehicle {
    // Abstract method (does not have a body)
    public abstract void start();

    // Regular method
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Concrete class Car inherits from Vehicle
class Car extends Vehicle {
    // Provide implementation for the abstract method start()
    @Override
    public void start() {
        System.out.println("Car started with a key.");
    }
}

// Concrete class Bike inherits from Vehicle
class Bike extends Vehicle {
    // Provide implementation for the abstract method start()
    @Override
    public void start() {
        System.out.println("Bike started with a kick.");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {
        // Create an instance of Car
        Vehicle myCar = new Car();
        myCar.start(); // Calls the start() method of Car
        myCar.stop();  // Calls the stop() method of Vehicle

        // Create an instance of Bike
        Vehicle myBike = new Bike();
        myBike.start(); // Calls the start() method of Bike
        myBike.stop();  // Calls the stop() method of Vehicle
    }
}

