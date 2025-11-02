import java.util.Scanner;

public class Program51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking base and exponent as input
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculating power using Math.pow()
        double result = Math.pow(base, exponent);

        // Display result
        System.out.println("\n----- Power Calculation -----");
        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        sc.close();
    }
}
