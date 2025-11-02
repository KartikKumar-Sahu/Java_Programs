// Program432.java
// Program to remove all white spaces from a string

import java.util.Scanner;

public class Program432 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Method 1: Using replaceAll() with regex
        String noSpaces = str.replaceAll("\\s+", "");  // \\s matches all whitespace (space, tab, newline)

        // Method 2: Using manual loop
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        // Display results
        System.out.println("\nOriginal String: " + str);
        System.out.println("After removing spaces (using replaceAll): " + noSpaces);
        System.out.println("After removing spaces (using loop): " + sb.toString());

        sc.close();
    }
}
