// Program378.java
// Program to print the elements of an array in reverse order

import java.util.Scanner;

public class Program378 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display elements in reverse order
        System.out.println("\nElements of the array in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
