import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Computing the square root using Math.sqrt()
        double sqrt = Math.sqrt(number);

        // Displaying the result
        System.out.println("The square root of " + number + " is: " + sqrt);

        sc.close();
    }
}
