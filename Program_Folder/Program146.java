import java.util.Scanner;

public class Program146 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double number as a string: ");
        String strNumber = sc.nextLine();

        // Converting String to double using Double.parseDouble()
        double number = Double.parseDouble(strNumber);

        System.out.println("Converted double value: " + number);

        sc.close();
    }
}
