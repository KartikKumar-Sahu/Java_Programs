import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables to hold the five numbers
        double num1, num2, num3, num4, num5;
        
        // Prompt the user to enter five numbers
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        num3 = scanner.nextDouble();
        
        System.out.print("Enter the fourth number: ");
        num4 = scanner.nextDouble();
        
        System.out.print("Enter the fifth number: ");
        num5 = scanner.nextDouble();
        
        // Calculate the average
        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5;
        
        // Print the result
        System.out.println("The average of the five numbers is: " + average);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
