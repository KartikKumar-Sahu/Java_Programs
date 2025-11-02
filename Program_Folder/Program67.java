import java.util.Scanner;

public class Program67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking marks input from the user
        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();

        // Validating marks range
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } 
        // Determining grade
        else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
