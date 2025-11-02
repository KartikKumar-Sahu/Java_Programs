// Program214.java
import java.util.Scanner;

public class Program214 {

    // Method to check if one number is the midpoint of the other two
    public static boolean isMiddlePoint(int a, int b, int c) {
        // Sort the numbers (min, mid, max)
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - (min + max);

        // Check if mid is exactly the midpoint between min and max
        return mid == (min + max) / 2 && (min + max) % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        boolean result = isMiddlePoint(num1, num2, num3);
        System.out.println("Is one number the middle point between the other two? " + result);

        sc.close();
    }
}
