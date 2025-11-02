// Program420.java
// Program to find the duplicate words in a string

import java.util.*;

public class Program420 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Convert to lowercase and split into words (ignore punctuation)
        String[] words = sentence.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Display duplicate words
        System.out.println("\nDuplicate words in the string:");
        boolean found = false;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate words found.");
        }

        sc.close();
    }
}
