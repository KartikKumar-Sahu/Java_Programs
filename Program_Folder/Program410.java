// Program410.java
// Program to count the total number of punctuation characters in a string

import java.util.Scanner;

public class Program410 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int punctuationCount = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a punctuation mark
            if (ch == '.' || ch == ',' || ch == ';' || ch == ':' ||
                ch == '!' || ch == '?' || ch == '\'' || ch == '"' ||
                ch == '-' || ch == '(' || ch == ')' || ch == '[' ||
                ch == ']' || ch == '{' || ch == '}') {
                punctuationCount++;
            }
        }

        // Display result
        System.out.println("\nTotal number of punctuation characters: " + punctuationCount);

        sc.close();
    }
}
