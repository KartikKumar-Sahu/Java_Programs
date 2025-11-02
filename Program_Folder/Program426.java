// Program426.java
// Program to get a character from the given string

import java.util.Scanner;

public class Program426 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Display length to help user choose valid index
        System.out.println("The string has " + str.length() + " characters (indices 0 to " + (str.length() - 1) + ").");

        // Input index position
        System.out.print("Enter the index of the character you want to get: ");
        int index = sc.nextInt();

        // Validate index range
        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("\nCharacter at index " + index + " is: '" + ch + "'");
        } else {
            System.out.println("\nInvalid index! Please enter a value between 0 and " + (str.length() - 1) + ".");
        }

        sc.close();
    }
}
