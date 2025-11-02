// Program412.java
// Program to determine whether a given string is a palindrome

import java.util.Scanner;

public class Program412 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove spaces and convert to lowercase for uniform comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        // Reverse the string manually
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check if the original and reversed strings are equal
        if (str.equals(reversed)) {
            System.out.println("\nThe string is a Palindrome.");
        } else {
            System.out.println("\nThe string is NOT a Palindrome.");
        }

        sc.close();
    }
}
