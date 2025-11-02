import java.util.Scanner;

public class Program88 {
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

        // Reversing the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Displaying reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
