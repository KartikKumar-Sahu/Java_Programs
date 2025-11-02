import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the cone: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cone: ");
        double height = sc.nextDouble();

        // Calculating volume using formula: (1/3) * π * r² * h
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        // Displaying result
        System.out.println("The volume of the cone is: " + volume);

        sc.close();
    }
}
