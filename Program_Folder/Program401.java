// Program401.java
// Program to insert a string using StringBuffer class

import java.util.Scanner;

public class Program401 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();

        // Input the string to insert
        System.out.print("Enter the string to insert: ");
        String toInsert = sc.nextLine();

        // Input the position
        System.out.print("Enter the position where you want to insert: ");
        int position = sc.nextInt();

        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer(original);

        // Validate position and insert
        if (position >= 0 && position <= sb.length()) {
            sb.insert(position, toInsert);
            System.out.println("\nAfter insertion:");
            System.out.println("Resulting String: " + sb.toString());
        } else {
            System.out.println("\nInvalid position! Please enter a value between 0 and " + sb.length());
        }

        sc.close();
    }
}
