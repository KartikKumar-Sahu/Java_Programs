import java.util.Scanner;

public class Program112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is not a Prime Number.");

        sc.close();
    }
}
