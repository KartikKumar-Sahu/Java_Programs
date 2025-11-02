import java.util.Scanner;
import java.util.Arrays;

public class Program100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array in ascending order
        Arrays.sort(arr);

        // Display sorted array
        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
