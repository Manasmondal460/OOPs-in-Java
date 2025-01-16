/*Encapsulation is a fundamental concept in object-oriented programming 
that involves bundling the data (variables) and the methods (functions) 
that operate on the data into a single unit, or class. 
It is used to restrict direct access to some of an object's components, 
which means the internal representation of an object cannot be seen from outside of the object's definition
Only the object's own methods can inspect or manipulate its fields. This helps to protect the object's integrity by preventing unintended or harmful interference.*/




// A class to represent a Student with encapsulation
class Student {
    // Private fields to protect the data
    private int id; // Unique ID of the student
    private String name; // Name of the student
    private int age; // Age of the student

    // Constructor to initialize the Student object
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        // Age validation: Ensuring the age is reasonable
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Setting default age to 18.");
            this.age = 18; // Default age if invalid input is given
        }
    }

    // Getter for ID (to access the ID of the student)
    public int getId() {
        return id;
    }

    // Setter for ID (to update the ID if needed)
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // Setter for Age with validation
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age not updated.");
        }
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// Main class to test the Student class
public class StudentEncapsulationDemo {
    public static void main(String[] args) {
        // Creating a new Student object
        Student student = new Student(101, "John Doe", 20);

        // Display initial student details
        System.out.println("Initial Student Details:");
        student.displayStudentInfo();

        // Update student details using setters
        student.setName("Jane Doe"); // Updating name
        student.setAge(25); // Updating age
        student.setId(102); // Updating ID

        // Display updated student details
        System.out.println("\nUpdated Student Details:");
        student.displayStudentInfo();

        // Trying to set an invalid age
        student.setAge(-5); // Invalid input
        student.setAge(150); // Invalid input
    }
}
