// Program389.java
// Program to find the 2nd largest number in an array

import java.util.Scanner;

public class Program389 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Check for valid input
        if (n < 2) {
            System.out.println("Array must contain at least 2 elements!");
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {  // descending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("\nArray in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print the 2nd largest element
        System.out.println("\n\nThe 2nd largest number in the array is: " + arr[1]);

        sc.close();
    }
}
