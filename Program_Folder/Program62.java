import java.util.Scanner;

public class Program62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter an integer to display its multiplication table: ");
        int n = sc.nextInt();

        System.out.println("\n----- Multiplication Table of " + n + " -----");

        // Loop to print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
