import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculating area
        double area = Math.PI * radius * radius;

        // Displaying result
        System.out.println("The area of the circle is: " + area);

        sc.close();
    }
}
