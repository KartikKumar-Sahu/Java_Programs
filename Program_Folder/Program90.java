import java.util.Scanner;

public class Program90 {
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

        boolean foundDuplicate = false;
        System.out.println("Duplicate elements in the array:");

        // Finding duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
