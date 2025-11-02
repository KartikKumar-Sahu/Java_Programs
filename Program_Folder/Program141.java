import java.util.Scanner;

public class Program141 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Converting int to String using String.valueOf()
        String strNumber = String.valueOf(number);

        System.out.println("Converted string value: " + strNumber);

        sc.close();
    }
}
