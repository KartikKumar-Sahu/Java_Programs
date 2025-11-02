import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

        // Calculating volume using formula: (4/3) * π * r³
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Displaying result
        System.out.println("The volume of the sphere is: " + volume);

        sc.close();
    }
}
