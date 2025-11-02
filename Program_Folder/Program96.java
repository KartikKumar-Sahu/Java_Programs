import java.util.Scanner;

public class Program96 {
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

        // Initialize min and max
        int min = arr[0];
        int max = arr[0];

        // Finding min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int difference = max - min;

        // Displaying result
        System.out.println("Largest value: " + max);
        System.out.println("Smallest value: " + min);
        System.out.println("Difference between largest and smallest value: " + difference);

        sc.close();
    }
}
