import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate the sum
        int sum = num1 + num2;
        
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
