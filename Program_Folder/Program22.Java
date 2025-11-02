import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd elements
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the results
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);

        scanner.close();
    }
}
