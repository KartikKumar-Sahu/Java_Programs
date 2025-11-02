// Program423.java
// Program to find the longest repeating sequence in a string

import java.util.Scanner;

public class Program423 {

    // Function to find the longest repeating sequence
    static String longestRepeatingSequence(String str) {
        int n = str.length();
        String result = "";
        int[][] lcs = new int[n + 1][n + 1]; // LCS table

        int length = 0; // Length of the longest repeating substring
        int row = 0, col = 0;

        // Build the LCS table (like Dynamic Programming)
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && lcs[i - 1][j - 1] < (j - i)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;

                    if (lcs[i][j] > length) {
                        length = lcs[i][j];
                        row = i;
                    }
                } else {
                    lcs[i][j] = 0;
                }
            }
        }

        // Build result string from the table
        if (length > 0) {
            for (int i = row - length + 1; i <= row; i++) {
                result += str.charAt(i - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String longestSeq = longestRepeatingSequence(str);

        // Display result
        if (longestSeq.length() > 0)
            System.out.println("\nLongest repeating sequence: " + longestSeq);
        else
            System.out.println("\nNo repeating sequence found.");

        sc.close();
    }
}
