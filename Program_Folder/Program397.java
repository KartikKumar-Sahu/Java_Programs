// Program397.java
// Program to perform deep copy for a String

import java.util.Scanner;

public class Program397 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Perform deep copy
        String deepCopy = new String(original);  // Creates a new String object

        // Display both strings
        System.out.println("\nOriginal String: " + original);
        System.out.println("Copied String:   " + deepCopy);

        // Check if both refer to the same object
        if (original == deepCopy)
            System.out.println("\nBoth strings refer to the same object (Shallow Copy).");
        else
            System.out.println("\nBoth strings are different objects (Deep Copy).");

        sc.close();
    }
}
