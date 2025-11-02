import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Checking if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }

        sc.close();
    }
}
