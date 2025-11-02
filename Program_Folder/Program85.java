import java.util.Scanner;

public class Program85 {
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

        // Taking the value to search
        System.out.print("Enter the value to search: ");
        int value = sc.nextInt();

        boolean found = false;

        // Checking if array contains the value
        for (int num : arr) {
            if (num == value) {
                found = true;
                break;
            }
        }

        // Displaying result
        if (found) {
            System.out.println("Array contains the value " + value + ".");
        } else {
            System.out.println("Array does not contain the value " + value + ".");
        }

        sc.close();
    }
}
