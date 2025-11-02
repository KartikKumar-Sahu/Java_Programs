import java.util.Scanner;

public class Program169 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert Decimal to Octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal equivalent: " + octal);

        sc.close();
    }
}
