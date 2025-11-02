// Program409.java
// Program to count the total number of characters in a string

import java.util.Scanner;

public class Program409 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Count total characters (including spaces)
        int totalChars = str.length();

        // Count characters excluding spaces
        int countWithoutSpaces = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                countWithoutSpaces++;
            }
        }

        // Display results
        System.out.println("\nTotal characters (including spaces): " + totalChars);
        System.out.println("Total characters (excluding spaces): " + countWithoutSpaces);

        sc.close();
    }
}
