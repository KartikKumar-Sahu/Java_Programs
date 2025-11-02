import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("\n----- First " + n + " Odd Natural Numbers -----");

        // Loop to display odd numbers and calculate sum
        for (int i = 1, count = 0; count < n; i += 2) {
            System.out.println(i);
            sum += i;
            count++;
        }

        // Displaying the sum
        System.out.println("Sum of first " + n + " odd natural numbers: " + sum);

        sc.close();
    }
}
