import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the base of the parallelogram: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the parallelogram: ");
        double height = sc.nextDouble();

        // Calculating area using formula: base * height
        double area = base * height;

        // Displaying result
        System.out.println("The area of the parallelogram is: " + area);

        sc.close();
    }
}
