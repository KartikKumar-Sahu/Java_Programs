import java.util.Scanner;

public class Program60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("\n----- Cube of Numbers up to " + n + " -----");

        // Loop to display cube of each number
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
        }

        sc.close();
    }
}
