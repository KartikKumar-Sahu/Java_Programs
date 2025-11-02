// Program374.java
// Program to find the frequency of each element in the array

import java.util.Scanner;

public class Program374 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] freq = new int[n]; // array to store frequency
        int visited = -1;        // marker for counted elements

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate frequency of each element
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // mark as visited
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }

        // Display the frequency of each element
        System.out.println("\nElement | Frequency");
        System.out.println("--------------------");
        for (int i = 0; i < n; i++) {
            if (freq[i] != visited) {
                System.out.println("   " + arr[i] + "    |    " + freq[i]);
            }
        }

        sc.close();
    }
}
