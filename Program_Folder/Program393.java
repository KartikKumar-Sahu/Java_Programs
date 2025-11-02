// Program393.java
// Program to remove duplicate elements from an array

import java.util.Scanner;
import java.util.Arrays;

public class Program393 {
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

        // Sort the array (so duplicates come together)
        Arrays.sort(arr);

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;

        // Remove duplicates
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element (it’s always unique in the sorted array)
        temp[j++] = arr[n - 1];

        // Display array after removing duplicates
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}
