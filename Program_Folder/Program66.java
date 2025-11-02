import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Checking the order
        if (num1 < num2 && num2 < num3) {
            System.out.println("Numbers are in increasing order.");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Numbers are in decreasing order.");
        } else {
            System.out.println("Numbers are neither in increasing nor decreasing order.");
        }

        sc.close();
    }
}
