import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform the operations
        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;
        double quotient = 0;
        double remainder = 0;

        // Check for division by zero
        if (num2 != 0) {
            quotient = num1 / num2;
            remainder = num1 % num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
