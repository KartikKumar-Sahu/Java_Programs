// Program427.java
// Program to insert a string into another string at a specific position

import java.util.Scanner;

public class Program427 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input main string
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        // Input string to insert
        System.out.print("Enter the string to insert: ");
        String insertStr = sc.nextLine();

        // Input position
        System.out.print("Enter the position where you want to insert the string: ");
        int position = sc.nextInt();

        // Validate position
        if (position < 0 || position > mainStr.length()) {
            System.out.println("\nInvalid position! Please enter a value between 0 and " + mainStr.length());
        } else {
            // Method 1: Using substring()
            String result1 = mainStr.substring(0, position) + insertStr + mainStr.substring(position);

            // Method 2: Using StringBuilder
            StringBuilder sb = new StringBuilder(mainStr);
            sb.insert(position, insertStr);

            // Display results
            System.out.println("\nAfter insertion (using substring): " + result1);
            System.out.println("After insertion (using StringBuilder): " + sb.toString());
        }

        sc.close();
    }
}
