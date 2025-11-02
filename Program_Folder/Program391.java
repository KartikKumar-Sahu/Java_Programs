// Program391.java
// Program to find the 2nd smallest number in an array

import java.util.Scanner;

public class Program391 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Validation check
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

        // Sort array in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {  // ascending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("\nArray in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print 2nd smallest element
        System.out.println("\n\nThe 2nd smallest number in the array is: " + arr[1]);

        sc.close();
    }
}
