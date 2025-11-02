import java.util.Scanner;

public class Program110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input integer from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reversed = 0;

        // Reverse the digits
        while (num != 0) {
            int digit = num % 10;     // Get last digit
            reversed = reversed * 10 + digit; // Add it to reversed number
            num /= 10;                // Remove last digit
        }

        // Display result
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
