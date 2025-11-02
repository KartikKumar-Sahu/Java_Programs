// Program364.java
// Program to show area of circle and rectangle using method overloading

import java.util.Scanner;

class Program364 {

    // Method to calculate area of a circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate area of a rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program364 shape = new Program364();

        System.out.println("=== Area Calculation using Method Overloading ===");

        // Circle area
        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();
        double circleArea = shape.area(radius);
        System.out.printf("Area of Circle = %.2f%n", circleArea);

        // Rectangle area
        System.out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double rectangleArea = shape.area(length, breadth);
        System.out.printf("Area of Rectangle = %.2f%n", rectangleArea);

        sc.close();
    }
}
