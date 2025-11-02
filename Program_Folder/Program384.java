// Program384.java
// Program to print the sum of all the items of the array

import java.util.Scanner;

public class Program384 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // Add element to sum
        }

        // Display sum of all elements
        System.out.println("\nSum of all elements in the array: " + sum);

        sc.close();
    }
}
