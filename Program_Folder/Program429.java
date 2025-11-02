// Program429.java
// Program to print a new line in a string

import java.util.Scanner;

public class Program429 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two parts of the string
        System.out.print("Enter the first part of the string: ");
        String part1 = sc.nextLine();

        System.out.print("Enter the second part of the string: ");
        String part2 = sc.nextLine();

        // Method 1: Using \n (newline escape sequence)
        String result1 = part1 + "\n" + part2;

        // Method 2: Using System.lineSeparator()
        String result2 = part1 + System.lineSeparator() + part2;

        // Display results
        System.out.println("\n--- Output using \\n ---");
        System.out.println(result1);

        System.out.println("\n--- Output using System.lineSeparator() ---");
        System.out.println(result2);

        sc.close();
    }
}
