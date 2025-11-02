// Program408.java
// Program to count the number of words in a String

import java.util.Scanner;

public class Program408 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Remove leading and trailing spaces
        sentence = sentence.trim();

        // Check if the string is empty
        if (sentence.isEmpty()) {
            System.out.println("\nThe string is empty. Word count: 0");
        } else {
            // Split string into words using one or more spaces (regex \\s+)
            String[] words = sentence.split("\\s+");

            // Display result
            System.out.println("\nNumber of words in the string: " + words.length);
        }

        sc.close();
    }
}
