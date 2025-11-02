// Program400.java
// Program to append a string using StringBuffer class

import java.util.Scanner;

public class Program400 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input initial string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        // Input string to append
        System.out.print("Enter the string to append: ");
        String str2 = sc.nextLine();

        // Create StringBuffer object with initial string
        StringBuffer sb = new StringBuffer(str1);

        // Append the second string
        sb.append(str2);

        // Display the result
        System.out.println("\nAfter appending:");
        System.out.println("Resulting String: " + sb.toString());

        sc.close();
    }
}
