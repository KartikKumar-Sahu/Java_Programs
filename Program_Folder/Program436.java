// Program436.java
// Program to split a string into a number of sub-strings

import java.util.Scanner;

public class Program436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Input number of substrings to split into
        System.out.print("Enter the number of sub-strings: ");
        int n = sc.nextInt();

        int len = str.length();

        // Check if division is possible
        if (n <= 0 || len % n != 0) {
            System.out.println("\nThe string cannot be divided into " + n + " equal parts.");
        } else {
            int partSize = len / n;

            System.out.println("\nThe string can be divided into " + n + " equal parts:");
            for (int i = 0; i < len; i += partSize) {
                String part = str.substring(i, i + partSize);
                System.out.println(part);
            }
        }

        sc.close();
    }
}
