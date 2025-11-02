import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        // Calculating area
        double area = 0.5 * base * height;

        // Displaying result
        System.out.println("The area of the triangle is: " + area);

        sc.close();
    }
}
