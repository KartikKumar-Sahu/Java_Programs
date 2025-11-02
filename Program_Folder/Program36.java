import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the length of the cuboid: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = sc.nextDouble();

        // Calculating volume using formula: length * width * height
        double volume = length * width * height;

        // Displaying result
        System.out.println("The volume of the cuboid is: " + volume);

        sc.close();
    }
}
