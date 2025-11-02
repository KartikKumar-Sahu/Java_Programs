// Program433.java
// Program to replace lowercase characters with uppercase and vice-versa

import java.util.Scanner;

public class Program433 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Iterate through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                // Convert lowercase to uppercase
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                // Convert uppercase to lowercase
                result.append(Character.toLowerCase(ch));
            } else {
                // Keep non-alphabetic characters as is
                result.append(ch);
            }
        }

        // Display result
        System.out.println("\nOriginal String: " + str);
        System.out.println("Modified String: " + result.toString());

        sc.close();
    }
}
