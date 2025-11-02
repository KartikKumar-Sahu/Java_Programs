import java.util.Scanner;

public class Program120 {

    // Method to calculate average of three numbers
    public static double averageOfThree(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        double average = averageOfThree(num1, num2, num3);
        System.out.println("Average of the three numbers is: " + average);

        sc.close();
    }
}
