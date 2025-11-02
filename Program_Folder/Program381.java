// Program381.java
// Program to print the largest element in an array

import java.util.Scanner;

public class Program381 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume the first element is the largest
        int largest = arr[0];

        // Traverse the array to find the largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Display the largest element
        System.out.println("\nThe largest element in the array is: " + largest);

        sc.close();
    }
}
