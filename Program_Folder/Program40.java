import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the side length of the cube: ");
        double side = sc.nextDouble();

        // Calculating surface area using formula: 6 * side²
        double surfaceArea = 6 * Math.pow(side, 2);

        // Displaying result
        System.out.println("The surface area of the cube is: " + surfaceArea);

        sc.close();
    }
}
