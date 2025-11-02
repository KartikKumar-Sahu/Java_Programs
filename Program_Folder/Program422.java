// Program422.java
// Program to find the largest and smallest word in a string

import java.util.Scanner;

public class Program422 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+"); // Split by one or more spaces

        // Initialize with the first word
        String smallest = words[0];
        String largest = words[0];

        // Loop through the words to find smallest and largest
        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        // Display results
        System.out.println("\nSmallest word: " + smallest);
        System.out.println("Largest word: " + largest);

        sc.close();
    }
}
