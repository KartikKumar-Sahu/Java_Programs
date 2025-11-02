import java.util.Scanner;

public class Program166 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        // Convert Hexadecimal to Decimal
        int decimal = Integer.parseInt(hex, 16);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}
