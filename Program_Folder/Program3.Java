import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate the product
        int product = num1 * num2;
        
        // Display the product
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
