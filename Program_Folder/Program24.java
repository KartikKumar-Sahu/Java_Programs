import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        // Reversing the number
        while (number != 0) {
            int digit = number % 10;                     // Get last digit
            reversedNumber = reversedNumber * 10 + digit; // Build reversed number
            number /= 10;                                // Remove last digit
        }

        // Checking if palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

        sc.close();
    }
}
