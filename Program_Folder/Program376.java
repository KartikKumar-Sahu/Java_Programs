// Program376.java
// Program to print the duplicate elements of an array

import java.util.Scanner;

public class Program376 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nDuplicate elements in the array are:");

        // Flag to track if any duplicates found
        boolean hasDuplicates = false;

        // Find and print duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    hasDuplicates = true;
                    break; // avoid printing same duplicate multiple times
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
