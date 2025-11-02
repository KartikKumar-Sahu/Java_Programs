import java.util.Scanner;

public class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculating surface area using formula: 2πr(h + r)
        double surfaceArea = 2 * Math.PI * radius * (height + radius);

        // Displaying result
        System.out.println("The surface area of the cylinder is: " + surfaceArea);

        sc.close();
    }
}
