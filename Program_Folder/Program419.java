// Program419.java
// Program to find the duplicate characters in a string

import java.util.Scanner;

public class Program419 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces
        str = str.toLowerCase().replaceAll("\\s+", "");

        int[] freq = new int[256]; // Frequency array for ASCII characters

        // Count character frequencies
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print duplicate characters
        System.out.println("\nDuplicate characters in the string:");
        boolean hasDuplicates = false;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " → " + freq[i] + " times");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }

        sc.close();
    }
}
