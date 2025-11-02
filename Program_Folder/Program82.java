import java.util.Scanner;

public class Program82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // Summing values
        }

        // Displaying result
        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}
