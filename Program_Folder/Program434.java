// Program434.java
// Program to replace the spaces of a string with a specific character

import java.util.Scanner;

public class Program434 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input original string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Input the replacement character
        System.out.print("Enter the character to replace spaces with: ");
        char replaceChar = sc.next().charAt(0);  // get single character input

        // Replace all spaces using replace() method
        String replacedStr = str.replace(' ', replaceChar);

        // Display results
        System.out.println("\nOriginal String: " + str);
        System.out.println("Modified String: " + replacedStr);

        sc.close();
    }
}
