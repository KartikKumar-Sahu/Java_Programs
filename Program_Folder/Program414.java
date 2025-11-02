// Program414.java
// Program to divide a string into 'N' equal parts

import java.util.Scanner;

public class Program414 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Input number of parts
        System.out.print("Enter the number of parts (N): ");
        int n = sc.nextInt();

        int len = str.length();

        // Check if division is possible
        if (len % n != 0) {
            System.out.println("\nThe string cannot be divided into " + n + " equal parts.");
        } else {
            System.out.println("\nThe string can be divided into " + n + " equal parts:");

            int partSize = len / n;

            // Loop to divide and print each part
            for (int i = 0; i < len; i += partSize) {
                String part = str.substring(i, i + partSize);
                System.out.println(part);
            }
        }

        sc.close();
    }
}
