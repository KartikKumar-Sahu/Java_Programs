// Program431.java
// Program to print smallest and biggest palindrome word(s) in a given string

import java.util.*;

public class Program431 {

    // Helper: check palindrome (case-insensitive), assumes input has only letters/digits
    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split to words, strip punctuation from each word
        String[] rawWords = sentence.split("\\s+");

        // Use LinkedHashSet to preserve order and avoid duplicate prints
        LinkedHashSet<String> palWords = new LinkedHashSet<>();

        for (String w : rawWords) {
            // remove non-alphanumeric characters around/inside words
            String cleaned = w.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            if (!cleaned.isEmpty() && isPalindrome(cleaned)) {
                palWords.add(cleaned); // store normalized version for consistent length check/output
            }
        }

        if (palWords.isEmpty()) {
            System.out.println("\nNo palindrome words found.");
            sc.close();
            return;
        }

        // Find min and max length among palindrome words
        int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
        for (String p : palWords) {
            int L = p.length();
            if (L < minLen) minLen = L;
            if (L > maxLen) maxLen = L;
        }

        // Collect all words that match min and max length
        List<String> smallest = new ArrayList<>();
        List<String> biggest  = new ArrayList<>();
        for (String p : palWords) {
            if (p.length() == minLen) smallest.add(p);
            if (p.length() == maxLen) biggest.add(p);
        }

        // Output
        System.out.println("\nPalindrome words found: " + palWords);
        System.out.println("Smallest palindrome word(s) (length " + minLen + "): " + smallest);
        System.out.println("Biggest  palindrome word(s) (length " + maxLen + "): " + biggest);

        sc.close();
    }
}
