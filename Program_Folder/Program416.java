// Program416.java
// Program to find all permutations of a string (using recursion)

import java.util.Scanner;

public class Program416 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nAll permutations of the string are:");
        generatePermutations(str, "");

        sc.close();
    }

    // Recursive method to generate permutations
    static void generatePermutations(String str, String prefix) {
        // Base condition
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }

        // Recur for each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remaining string after removing the selected character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            generatePermutations(remaining, prefix + ch);
        }
    }
}
