// Program417.java
// Program to find maximum and minimum occurring character in a string

import java.util.Scanner;

public class Program417 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces for uniform comparison
        str = str.toLowerCase().replaceAll("\\s+", "");

        int[] freq = new int[256]; // ASCII character frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Initialize min and max variables
        char minChar = ' ', maxChar = ' ';
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Traverse the frequency array
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) { // character exists in string
                if (freq[i] > max) {
                    max = freq[i];
                    maxChar = (char) i;
                }
                if (freq[i] < min) {
                    min = freq[i];
                    minChar = (char) i;
                }
            }
        }

        // Display results
        System.out.println("\nMaximum occurring character: '" + maxChar + "' (appears " + max + " times)");
        System.out.println("Minimum occurring character: '" + minChar + "' (appears " + min + " time(s))");

        sc.close();
    }
}
