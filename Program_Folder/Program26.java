import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int sum = 0;

        // Adding digits using a while loop
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;              // Add it to sum
            number /= 10;              // Remove the last digit
        }

        System.out.println("The sum of all digits is: " + sum);

        sc.close();
    }
}
