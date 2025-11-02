import java.util.Scanner;

public class Program97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements (only 0s and 1s): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " elements (only 0 or 1):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count number of zeros
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                countZero++;
        }

        // Fill first part with 0s and remaining with 1s
        for (int i = 0; i < n; i++) {
            if (i < countZero)
                arr[i] = 0;
            else
                arr[i] = 1;
        }

        // Displaying segregated array
        System.out.println("Array after segregation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
