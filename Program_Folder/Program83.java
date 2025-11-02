import java.util.Scanner;

public class Program83 {
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

        // Taking the element to find
        System.out.print("Enter the element to find its index: ");
        int key = sc.nextInt();

        // Searching for the element
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        // Displaying result
        if (index != -1)
            System.out.println("Element " + key + " found at index: " + index);
        else
            System.out.println("Element " + key + " not found in the array.");

        sc.close();
    }
}
