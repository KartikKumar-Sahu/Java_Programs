// Program430.java
// Program to print even length words from a string

import java.util.Scanner;

public class Program430 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+"); // Split by one or more spaces

        System.out.println("\nEven length words in the sentence:");
        boolean found = false;

        // Iterate through each word
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No even length words found.");
        }

        sc.close();
    }
}
