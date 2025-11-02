// Program399.java
// Program to remove all occurrences of a given character from input String

import java.util.Scanner;

public class Program399 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Input character to remove
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        // Method 1: Using replace() method
        String result1 = input.replace(String.valueOf(ch), "");

        // Display result
        System.out.println("\nAfter removing '" + ch + "' (using replace): " + result1);

        // Method 2: Using manual loop (for understanding)
        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ch) {
                result2.append(input.charAt(i));
            }
        }

        System.out.println("After removing '" + ch + "' (using loop): " + result2);

        sc.close();
    }
}
