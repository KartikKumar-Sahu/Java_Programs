import java.util.Scanner;

public class Program52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three numbers as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Finding the greatest number
        int greatest;

        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Display result
        System.out.println("\n----- Greatest Number Finder -----");
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
