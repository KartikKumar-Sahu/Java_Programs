// Program445.java
// Program to demonstrate insert, append, delete, and replace functions of StringBuffer

import java.util.Scanner;

public class Program445 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a StringBuffer object
        System.out.print("Enter the initial string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.println("\nOriginal StringBuffer: " + sb);

        // Append text to the end
        sb.append(" Java");
        System.out.println("After append(): " + sb);

        // Insert text at a specific position
        sb.insert(0, "Welcome ");
        System.out.println("After insert(): " + sb);

        // Replace a portion of text
        sb.replace(8, 14, "to");
        System.out.println("After replace(): " + sb);

        // Delete a portion of text
        sb.delete(0, 8);
        System.out.println("After delete(): " + sb);

        // Reverse (extra demonstration)
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        sc.close();
    }
}