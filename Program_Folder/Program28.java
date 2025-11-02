import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Calculating area
        double area = length * width;

        // Displaying result
        System.out.println("The area of the rectangle is: " + area);

        sc.close();
    }
}
