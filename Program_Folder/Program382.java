// Program382.java
// Program to print the smallest element in an array

import java.util.Scanner;

public class Program382 {
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

        // Assume the first element is the smallest
        int smallest = arr[0];

        // Traverse the array to find the smallest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Display the smallest element
        System.out.println("\nThe smallest element in the array is: " + smallest);

        sc.close();
    }
}
