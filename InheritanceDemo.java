// Base class or Parent class
class Vehicle {
    private String brand; // Encapsulated field for brand

    // Constructor to initialize the brand
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Method to display the type of vehicle
    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

// Derived class or Child class
class Car extends Vehicle {
    private int numberOfDoors; // Encapsulated field for the number of doors

    // Constructor to initialize brand and number of doors
    public Car(String brand, int numberOfDoors) {
        super(brand); // Call the parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car-specific details
    public void displayCarDetails() {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // Overriding the displayType method from the parent class
    @Override
    public void displayType() {
        System.out.println("This is a car.");
    }
}

// Main class to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", 4);

        // Call methods to display details
        myCar.displayType(); // Calls the overridden method
        myCar.displayCarDetails(); // Displays car-specific details
    }
}
