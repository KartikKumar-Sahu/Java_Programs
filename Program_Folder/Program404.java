// Program404.java
// Program to check if two strings are anagrams

import java.util.Arrays;
import java.util.Scanner;

public class Program404 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("\nStrings are NOT anagrams (different lengths).");
        } else {
            // Convert to character arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("\nStrings are Anagrams!");
            } else {
                System.out.println("\nStrings are NOT Anagrams!");
            }
        }

        sc.close();
    }
}
