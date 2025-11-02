import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Convert the integer to positive if it is negative
        num = Math.abs(num);
        
        // Variable to store the sum of the digits
        int sum = 0;
        
        // Loop to extract digits and calculate the sum
        while (num > 0) {
            // Get the last digit of the number
            int digit = num % 10;
            
            // Add the digit to the sum
            sum += digit;
            
            // Remove the last digit from the number
            num = num / 10;
        }
        
        // Display the sum of the digits
        System.out.println("The sum of the digits is: " + sum);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
