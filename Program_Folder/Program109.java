import java.util.Scanner;

public class Program109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        long factorial = 1;

        // Check for negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            // Display result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}
