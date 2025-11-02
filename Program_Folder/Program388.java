// Program388.java
// Program to find the 3rd largest number in an array

import java.util.Scanner;

public class Program388 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Check for valid input
        if (n < 3) {
            System.out.println("Array must contain at least 3 elements!");
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

        // Print the 3rd largest element
        System.out.println("\n\nThe 3rd largest number in the array is: " + arr[2]);

        sc.close();
    }
}
