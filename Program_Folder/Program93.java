import java.util.Scanner;

public class Program93 {
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

        // Checking if array has at least two elements
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Finding first and second largest numbers
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest number (all elements may be equal).");
        } else {
            System.out.println("The second largest number is: " + second);
        }

        sc.close();
    }
}
