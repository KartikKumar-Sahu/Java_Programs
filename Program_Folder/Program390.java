// Program390.java
// Program to find the largest number in an array

import java.util.Scanner;

public class Program390 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume the first element is the largest
        int largest = arr[0];

        // Loop through the array to find the largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Display the largest number
        System.out.println("\nThe largest number in the array is: " + largest);

        sc.close();
    }
}
