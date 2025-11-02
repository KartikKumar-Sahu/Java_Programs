import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();

        // Calculating area using formula: (√3 / 4) * side²
        double area = (Math.sqrt(3) / 4) * side * side;

        // Displaying result
        System.out.println("The area of the equilateral triangle is: " + area);

        sc.close();
    }
}
