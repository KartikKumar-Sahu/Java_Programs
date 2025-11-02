// Program373.java
// Program to copy all elements of one array into another array

import java.util.Scanner;

public class Program373 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Declare two arrays: original and copy
        int[] original = new int[n];
        int[] copy = new int[n];

        // Input elements for the original array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // Copy elements from original array to copy array
        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        // Display the original array
        System.out.println("\nOriginal Array Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(original[i] + " ");
        }

        // Display the copied array
        System.out.println("\nCopied Array Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}
