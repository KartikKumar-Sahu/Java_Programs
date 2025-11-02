import java.util.Scanner;

public class Program64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int count = 0;
            int temp = number;

            // Counting digits using while loop
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            System.out.println("Number of digits in " + number + " is: " + count);
        }

        sc.close();
    }
}
