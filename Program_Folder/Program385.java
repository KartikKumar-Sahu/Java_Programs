// Program385.java
// Program to right rotate the elements of an array

import java.util.Scanner;

public class Program385 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number of rotations
        System.out.print("Enter the number of times to rotate right: ");
        int rotations = sc.nextInt();

        // Normalize rotations if greater than array length
        rotations = rotations % n;

        // Perform right rotation
        for (int r = 0; r < rotations; r++) {
            int last = arr[n - 1]; // store last element
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1]; // shift elements right
            }
            arr[0] = last; // move last to first
        }

        // Display rotated array
        System.out.println("\nArray after " + rotations + " right rotations:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
