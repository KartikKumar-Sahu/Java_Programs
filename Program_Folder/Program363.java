// Program363.java
// Program to enter student details where roll number is auto-generated

import java.util.Scanner;

class Program363 {

    // Instance variables
    int rollNo;
    String name;
    String studentClass;

    // Static variable to auto-increment roll numbers
    static int nextRollNo = 1;

    // Constructor that takes name and class, assigns roll number automatically
    Program363(String name, String studentClass) {
        this.rollNo = nextRollNo++;
        this.name = name;
        this.studentClass = studentClass;
    }

    // Method to display student information
    void display() {
        System.out.printf("Roll No: %d | Name: %s | Class: %s%n", rollNo, name, studentClass);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to store 10 students
        Program363[] students = new Program363[10];

        System.out.println("=== Enter details for 10 Students ===");

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nEnter details for Student %d:%n", i + 1);
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Class: ");
            String studentClass = sc.nextLine();

            // Create new student object
            students[i] = new Program363(name, studentClass);
        }

        // Display all student details
        System.out.println("\n=== Student Information ===");
        for (Program363 s : students) {
            s.display();
        }

        sc.close();
    }
}
