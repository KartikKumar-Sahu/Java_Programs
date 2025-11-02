import java.util.Scanner;

public class Program143 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a long number: ");
        long number = sc.nextLong();

        // Converting long to String using String.valueOf()
        String strNumber = String.valueOf(number);

        System.out.println("Converted string value: " + strNumber);

        sc.close();
    }
}
