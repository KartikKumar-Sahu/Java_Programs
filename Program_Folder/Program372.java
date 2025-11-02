// Program372.java
// Program to demonstrate encapsulation with grade validation in a Student class

import java.util.ArrayList;

class Student {

    // Private instance variables
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades;  // To store multiple grades

    // Constructor
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    // Getter and Setter for student_id
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        if (student_id > 0) {
            this.student_id = student_id;
        } else {
            System.out.println("Invalid Student ID! It must be positive.");
        }
    }

    // Getter and Setter for student_name
    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        if (student_name != null && !student_name.trim().isEmpty()) {
            this.student_name = student_name;
        } else {
            System.out.println("Invalid name! Name cannot be empty.");
        }
    }

    // Method to add a grade with validation
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade! Please enter a grade between 0 and 100.");
        }
    }

    // Method to calculate and return average grade
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int g : grades) {
            total += g;
        }
        return (double) total / grades.size();
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("\nStudent ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + (grades.isEmpty() ? "No grades added yet" : grades));
        System.out.printf("Average Grade: %.2f%n", getAverageGrade());
    }
}

// Main class
public class Program372 {
    public static void main(String[] args) {

        // Create a Student object
        Student s1 = new Student(101, "Alice Johnson");

        System.out.println("=== Student Information ===");
        s1.displayInfo();

        // Adding valid and invalid grades
        System.out.println("\nAdding Grades:");
        s1.addGrade(85);
        s1.addGrade(92);
        s1.addGrade(-10);  // Invalid
        s1.addGrade(105);  // Invalid
        s1.addGrade(78);

        // Display updated student details
        s1.displayInfo();

        // Modify name and ID
        System.out.println("\nUpdating Student Details:");
        s1.setStudentName("Alice Cooper");
        s1.setStudentId(102);

        // Final info
        s1.displayInfo();
    }
}
