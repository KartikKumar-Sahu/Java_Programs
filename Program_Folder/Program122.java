import java.util.Scanner;

public class Program122 {

    // Method to count total words in a string
    public static int countWords(String str) {
        // Trim leading and trailing spaces
        str = str.trim();

        // If the string is empty after trimming, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Split string by one or more spaces
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int wordCount = countWords(input);
        System.out.println("Total number of words: " + wordCount);

        sc.close();
    }
}
