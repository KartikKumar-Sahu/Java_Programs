// Program395.java
// Program to sort an array in Java (Ascending and Descending order)

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Program395 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n]; // Using Integer (not int) for descending sort

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array in ascending order using Arrays.sort()
        Arrays.sort(arr);
        System.out.println("\nArray in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sort array in descending order using Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("\n\nArray in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
