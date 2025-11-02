// Program379.java
// Program to print the elements of an array present on even positions

import java.util.Scanner;

public class Program379 {
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

        // Print elements at even positions (1-based indexing)
        System.out.println("\nElements present at even positions:");
        for (int i = 1; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
