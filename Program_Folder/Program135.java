import java.util.Scanner;

public class Program135 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double number = sc.nextDouble();

        if (number == Math.floor(number)) {
            System.out.println(number + " is an integer.");
        } else {
            System.out.println(number + " is not an integer.");
        }

        sc.close();
    }
}
