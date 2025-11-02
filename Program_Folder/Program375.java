// Program375.java
// Program to left rotate the elements of an array

import java.util.Scanner;

public class Program375 {
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
        System.out.print("Enter number of times to rotate left: ");
        int rotations = sc.nextInt();

        // Normalize rotations if greater than array length
        rotations = rotations % n;

        // Perform left rotation
        for (int r = 0; r < rotations; r++) {
            int first = arr[0]; // store first element
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first; // move first to last
        }

        // Display the rotated array
        System.out.println("\nArray after " + rotations + " left rotations:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
