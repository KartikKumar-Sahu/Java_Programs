import java.util.Scanner;

public class Program98 {
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

        // Display original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Rotate array by one (clockwise)
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        // Display rotated array
        System.out.println("\nArray after one clockwise rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
