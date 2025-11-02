import java.util.Scanner;

public class Program124 {

    // Method to compute the sum of digits of an integer
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // extract last digit and add to sum
            num /= 10;        // remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int result = sumOfDigits(number);
        System.out.println("Sum of the digits: " + result);

        sc.close();
    }
}
