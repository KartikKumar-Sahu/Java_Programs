// Program203.java
import java.util.Scanner;

public class Program203 {

    // Method to find smallest among three numbers
    public static int findSmallest(int a, int b, int c) {
        int smallest;
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }
        return smallest;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);

        sc.close();
    }
}
