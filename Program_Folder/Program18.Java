import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string representing an integer
        System.out.print("Enter a string to convert to integer: ");
        String input = scanner.nextLine();

        try {
            // Convert the string to an integer
            int number = Integer.parseInt(input);

            // Display the result
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            // Handle the case when the input is not a valid integer
            System.out.println("Invalid input! Please enter a valid integer string.");
        }

        // Close the scanner
        scanner.close();
    }
}
