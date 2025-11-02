import java.util.Scanner;

public class Program165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert Decimal to Binary
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }
}
