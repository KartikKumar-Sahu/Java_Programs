import java.util.Scanner;

public class Program111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        // Input integers and calculate sums
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        // Display results
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();
    }
}
