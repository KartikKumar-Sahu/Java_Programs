import java.util.Scanner;

public class Program133 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;      // extract last digit
            reversed = reversed * 10 + digit; // append digit
            num = num / 10;            // remove last digit
        }

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
