import java.util.Scanner;

public class Program86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max and min with first element
        int max = arr[0];
        int min = arr[0];

        // Finding max and min
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Displaying result
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        sc.close();
    }
}
