import java.util.Scanner;

public class Program87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1]; // Extra space for new element

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking new element and position
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter the position (1 to " + (n + 1) + "): ");
        int position = sc.nextInt();

        if (position < 1 || position > n + 1) {
            System.out.println("Invalid position!");
        } else {
            // Shifting elements to the right
            for (int i = n; i >= position; i--) {
                arr[i] = arr[i - 1];
            }

            // Inserting new element
            arr[position - 1] = element;

            // Displaying updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
