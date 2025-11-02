import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Create strings for nn and nnn by concatenation
        String nn = Integer.toString(n) + Integer.toString(n);
        String nnn = Integer.toString(n) + Integer.toString(n) + Integer.toString(n);

        // Convert the strings back to integers and compute the sum
        int result = n + Integer.parseInt(nn) + Integer.parseInt(nnn);

        // Display the result
        System.out.println("The value of n + nn + nnn is: " + result);

        // Close the scanner
        scanner.close();
    }
}
