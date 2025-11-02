// Program392.java
// Program to find the smallest number in an array

import java.util.Scanner;

public class Program392 {
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

        // Assume the first element is the smallest
        int smallest = arr[0];

        // Traverse the array to find the smallest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Display the smallest number
        System.out.println("\nThe smallest number in the array is: " + smallest);

        sc.close();
    }
}
