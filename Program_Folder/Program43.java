import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for total count
        System.out.print("Enter how many numbers you want to sum: ");
        int n = sc.nextInt();

        double sum = 0;

        // Taking N numbers as input
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            sum += num;
        }

        // Displaying result
        System.out.println("The sum of " + n + " numbers is: " + sum);

        sc.close();
    }
}
