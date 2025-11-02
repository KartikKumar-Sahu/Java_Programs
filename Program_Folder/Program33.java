import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the base area of the prism: ");
        double baseArea = sc.nextDouble();

        System.out.print("Enter the perimeter of the base: ");
        double basePerimeter = sc.nextDouble();

        System.out.print("Enter the height of the prism: ");
        double height = sc.nextDouble();

        // Calculating total surface area using formula: 2 * baseArea + basePerimeter * height
        double surfaceArea = (2 * baseArea) + (basePerimeter * height);

        // Displaying result
        System.out.println("The surface area of the prism is: " + surfaceArea);

        sc.close();
    }
}
