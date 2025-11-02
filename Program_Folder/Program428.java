// Program428.java
// Program to iterate over characters in a string

import java.util.Scanner;

public class Program428 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nCharacters in the string:");

        // Method 1: Using a for loop and charAt()
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }

        // Method 2: Using enhanced for-loop with toCharArray()
        System.out.println("\nUsing enhanced for-loop:");
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        sc.close();
    }
}
