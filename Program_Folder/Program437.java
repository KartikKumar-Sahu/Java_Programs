// Program437.java
// Program to swap two strings without using a third or temp variable

import java.util.Scanner;

public class Program437 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\nBefore swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping without using third variable
        str1 = str1 + str2;  // Combine both strings into str1
        str2 = str1.substring(0, str1.length() - str2.length());  // Extract original str1
        str1 = str1.substring(str2.length());  // Extract original str2

        System.out.println("\nAfter swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        sc.close();
    }
}
