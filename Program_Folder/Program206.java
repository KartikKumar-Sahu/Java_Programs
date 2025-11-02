// Program206.java
import java.util.Scanner;

public class Program206 {

    // Method to count all words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0; // Return 0 if the string is null or empty
        }

        // Split the string by one or more spaces
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int wordCount = countWords(input);
        System.out.println("Total number of words: " + wordCount);

        sc.close();
    }
}
