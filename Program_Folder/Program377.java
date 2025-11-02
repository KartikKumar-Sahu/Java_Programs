// Program377.java
// Program to print the elements of an array

import java.util.Scanner;

public class Program377 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("\nElements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
