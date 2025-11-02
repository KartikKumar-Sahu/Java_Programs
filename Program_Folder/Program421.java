// Program421.java
// Program to find the frequency of characters in a string

import java.util.Scanner;

public class Program421 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces
        str = str.toLowerCase().replaceAll("\\s+", "");

        int[] freq = new int[256]; // ASCII array for character frequencies

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Display frequencies
        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " → " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
