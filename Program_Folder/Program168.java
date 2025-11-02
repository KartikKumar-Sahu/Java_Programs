import java.util.Scanner;

public class Program168 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        // Convert Octal to Decimal
        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}
