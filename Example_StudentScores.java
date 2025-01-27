/*
 * Explanation:
 * 
 * Objective: Write a Java program to manage a collection of students and calculate their average scores.
 * 
 * Steps:
 * 1. Create a class named `Student` with properties for the student's name and an array of scores.
 * 2. Provide methods to calculate the average score and display the student's information.
 * 3. Create a class named `StudentManager` to manage a collection of students and calculate the overall average score.
 * 4. Create instances of the `Student` class, add them to the `StudentManager`, and display the results.
 */

import java.util.ArrayList;
import java.util.List;

// Step 1: Create a class named `Student`
class Student {
    private String name;
    private int[] scores;

    // Constructor to initialize the student's name and scores
    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // Step 2: Method to calculate the average score
    public double calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Step 2: Method to display the student's information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage Score: " + calculateAverage());
    }
}

// Step 3: Create a class named `StudentManager`
class StudentManager {
    private List<Student> students;

    // Constructor to initialize the student list
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Method to add a student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Step 3: Method to calculate the overall average score
    public double calculateOverallAverage() {
        double totalSum = 0;
        int totalScores = 0;
        for (Student student : students) {
            for (int score : student.scores) {
                totalSum += score;
                totalScores++;
            }
        }
        return totalSum / totalScores;
    }

    // Method to display the information of all students
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }
}

public class StudentScores {

    public static void main(String[] args) {
        // Step 4: Create instances of the Student class
        Student student1 = new Student("Alice", new int[]{85, 90, 78});
        Student student2 = new Student("Bob", new int[]{92, 88, 95});
        Student student3 = new Student("Charlie", new int[]{75, 80, 70});

        // Create an instance of the StudentManager class
        StudentManager manager = new StudentManager();

        // Add students to the manager
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        // Display the information of all students
        manager.displayAllStudents();

        // Step 4: Display the overall average score
        System.out.println("Overall Average Score: " + manager.calculateOverallAverage());
    }
}
