import java.util.Scanner;

public class Program145 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float number = sc.nextFloat();

        // Converting float to String using String.valueOf()
        String strNumber = String.valueOf(number);

        System.out.println("Converted string value: " + strNumber);

        sc.close();
    }
}
