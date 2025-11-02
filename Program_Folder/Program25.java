import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Using bitwise operators to add numbers
        while (num2 != 0) {
            int carry = num1 & num2;   // Calculate carry
            num1 = num1 ^ num2;        // Sum without carry
            num2 = carry << 1;         // Shift carry to left by 1
        }

        System.out.println("The sum is: " + num1);

        sc.close();
    }
}
