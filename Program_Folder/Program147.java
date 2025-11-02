import java.util.Scanner;

public class Program147 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double number = sc.nextDouble();

        // Converting double to String using String.valueOf()
        String strNumber = String.valueOf(number);

        System.out.println("Converted string value: " + strNumber);

        sc.close();
    }
}
