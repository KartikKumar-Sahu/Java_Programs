// Program418.java
// Program to find the reverse of a string

import java.util.Scanner;

public class Program418 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Method 1: Using a loop
        String reversed1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed1 += str.charAt(i);
        }

        // Method 2: Using StringBuffer
        String reversed2 = new StringBuffer(str).reverse().toString();

        // Method 3: Using StringBuilder
        String reversed3 = new StringBuilder(str).reverse().toString();

        // Display results
        System.out.println("\nReversed string (using loop): " + reversed1);
        System.out.println("Reversed string (using StringBuffer): " + reversed2);
        System.out.println("Reversed string (using StringBuilder): " + reversed3);

        sc.close();
    }
}
