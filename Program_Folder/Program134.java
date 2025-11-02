import java.util.Scanner;
import java.text.DecimalFormat;

public class Program134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        float number = sc.nextFloat();

        System.out.print("Enter number of decimal places to round: ");
        int decimals = sc.nextInt();

        // Using String format
        String format = "%." + decimals + "f";
        String rounded = String.format(format, number);

        System.out.println("Rounded number: " + rounded);

        sc.close();
    }
}
