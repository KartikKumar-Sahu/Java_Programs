// Program411.java
// Program to count the total number of vowels and consonants in a string

import java.util.Scanner;

public class Program411 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert string to lowercase for easy comparison
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if it's an alphabet letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if it’s a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display results
        System.out.println("\nTotal number of vowels: " + vowels);
        System.out.println("Total number of consonants: " + consonants);

        sc.close();
    }
}
