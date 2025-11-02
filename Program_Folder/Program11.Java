import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Compare the two numbers
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
