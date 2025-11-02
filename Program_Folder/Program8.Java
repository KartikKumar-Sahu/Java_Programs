import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        
        // Convert the binary number to decimal
        try {
            int decimal = Integer.parseInt(binary, 2); // The second argument '2' specifies binary
            // Display the result
            System.out.println("The decimal equivalent of binary " + binary + " is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number! Please enter a valid binary number.");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
