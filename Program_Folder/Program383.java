// Program383.java
// Program to print the number of elements present in an array

import java.util.Scanner;

public class Program383 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements you want in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate and display number of elements
        int numberOfElements = arr.length;

        System.out.println("\nNumber of elements present in the array: " + numberOfElements);

        sc.close();
    }
}
