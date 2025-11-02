import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the length of the first diagonal (d1): ");
        double d1 = sc.nextDouble();

        System.out.print("Enter the length of the second diagonal (d2): ");
        double d2 = sc.nextDouble();

        // Calculating area using formula: (d1 * d2) / 2
        double area = (d1 * d2) / 2;

        // Displaying result
        System.out.println("The area of the rhombus is: " + area);

        sc.close();
    }
}
