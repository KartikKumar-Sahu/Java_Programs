import java.util.Scanner;

public class Program104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input key element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Search for the key element
        boolean found = false;
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Element " + key + " found at index position: " + position);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        sc.close();
    }
}
