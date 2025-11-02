import java.util.Scanner;

public class Program164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // Convert Binary to Decimal
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}
