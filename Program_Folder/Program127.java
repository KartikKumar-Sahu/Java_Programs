import java.util.Scanner;

public class Program127 {

    // Method to calculate area of a pentagon
    public static double areaOfPentagon(double sideLength) {
        // Formula: (5 * s²) / (4 * tan(π / 5))
        return (5 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the pentagon: ");
        double side = sc.nextDouble();

        double area = areaOfPentagon(side);
        System.out.println("Area of the pentagon: " + area);

        sc.close();
    }
}
