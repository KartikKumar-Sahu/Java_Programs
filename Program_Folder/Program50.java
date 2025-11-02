import java.util.Scanner;

public class Program50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking coordinates of first point
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Taking coordinates of second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculating distance using distance formula
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Display result
        System.out.println("\n----- Distance Between Two Points -----");
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Distance: " + distance);

        sc.close();
    }
}
