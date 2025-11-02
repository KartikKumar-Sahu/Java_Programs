import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the user's input
        int decimal = 0;
        
        // Loop until the user enters a valid integer
        boolean validInput = false;
        while (!validInput) {
            try {
                // Prompt the user to enter a decimal number
                System.out.print("Enter a decimal number: ");
                decimal = scanner.nextInt();
                validInput = true; // If input is valid, break the loop
            } catch (java.util.InputMismatchException e) {
                // If input is invalid, print an error message and prompt again
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }
        
        // Convert the decimal number to binary
        String binary = Integer.toBinaryString(decimal);
        
        // Display the result
        System.out.println("The binary equivalent of " + decimal + " is: " + binary);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
