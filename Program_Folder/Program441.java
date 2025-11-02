// Program441.java
// Program to reverse a string word by word

import java.util.Scanner;

public class Program441 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.trim().split("\\s+"); // split by one or more spaces

        // Reverse the order of words
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i];
            if (i != 0) reversedSentence += " "; // add space except after last word
        }

        // Display result
        System.out.println("\nOriginal Sentence: " + sentence);
        System.out.println("Reversed Sentence (word by word): " + reversedSentence);

        sc.close();
    }
}
