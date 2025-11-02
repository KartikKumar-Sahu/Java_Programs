import java.util.Scanner;

public class Program95 {
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

        int evenCount = 0, oddCount = 0;

        // Counting even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        // Displaying results
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);

        sc.close();
    }
}
