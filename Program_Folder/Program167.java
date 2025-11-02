import java.util.Scanner;

public class Program167 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert Decimal to Hexadecimal
        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal equivalent: " + hex);

        sc.close();
    }
}
