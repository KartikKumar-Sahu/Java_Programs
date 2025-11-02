// Program440.java
// Program to reverse a string without using reverse() function

import java.util.Scanner;

public class Program440 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Method 1: Using a loop
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Display result
        System.out.println("\nOriginal String: " + str);
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
