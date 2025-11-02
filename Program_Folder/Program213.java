// Program213.java
import java.util.Scanner;

public class Program213 {

    // Method to check if three numbers are consecutive
    public static boolean areConsecutive(int a, int b, int c) {
        // Sort numbers (smallest to largest)
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - (min + max);

        // Check if consecutive
        return (mid == min + 1) && (max == mid + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        boolean result = areConsecutive(num1, num2, num3);
        System.out.println("Are the numbers consecutive? " + result);

        sc.close();
    }
}
