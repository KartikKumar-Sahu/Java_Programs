import java.util.Scanner;

public class Program126 {

    // Method to calculate area of a triangle
    public static double areaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        double area = areaOfTriangle(base, height);
        System.out.println("Area of the triangle: " + area);

        sc.close();
    }
}
