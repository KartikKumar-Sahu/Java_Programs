import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();

        long factorial = 1;

        // Factorial logic
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Displaying result
        System.out.println("The factorial of " + number + " is: " + factorial);

        sc.close();
    }
}
