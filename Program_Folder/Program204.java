// Program204.java
import java.util.Scanner;

public class Program204 {

    // Method to compute the average of three numbers
    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        double average = computeAverage(num1, num2, num3);
        System.out.println("The average of three numbers is: " + average);

        sc.close();
    }
}
