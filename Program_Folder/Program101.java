import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Program101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n]; // Use Integer (object) for Collections.reverseOrder()

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Display sorted array
        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
