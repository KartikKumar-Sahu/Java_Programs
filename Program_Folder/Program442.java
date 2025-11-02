// Program442.java
// Program to check if two strings are created with the same characters

import java.util.Arrays;
import java.util.Scanner;

public class Program442 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lowercase for fair comparison
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are equal first
        if (str1.length() != str2.length()) {
            System.out.println("\nStrings are NOT created with the same characters (different lengths).");
        } else {
            // Convert strings to char arrays and sort them
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("\n✅ The two strings are created with the same characters.");
            } else {
                System.out.println("\n❌ The two strings are NOT created with the same characters.");
            }
        }

        sc.close();
    }
}
