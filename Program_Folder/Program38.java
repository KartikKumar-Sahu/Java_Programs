import java.util.Scanner;

public class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the length of the cuboid: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = sc.nextDouble();

        // Calculating surface area using formula: 2(lw + lh + wh)
        double surfaceArea = 2 * (length * width + length * height + width * height);

        // Displaying result
        System.out.println("The surface area of the cuboid is: " + surfaceArea);

        sc.close();
    }
}
