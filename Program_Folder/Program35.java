import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculating volume using formula: π * r² * h
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Displaying result
        System.out.println("The volume of the cylinder is: " + volume);

        sc.close();
    }
}
