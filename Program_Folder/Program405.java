// Program405.java
// Program to check whether a string is a palindrome

import java.util.Scanner;

public class Program405 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces for uniform comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        // Reverse the string using StringBuffer
        String reversed = new StringBuffer(str).reverse().toString();

        // Check if original and reversed strings are equal
        if (str.equals(reversed)) {
            System.out.println("\nThe string is a Palindrome.");
        } else {
            System.out.println("\nThe string is NOT a Palindrome.");
        }

        sc.close();
    }
}
