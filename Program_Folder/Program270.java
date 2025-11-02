import java.util.Scanner;

// Define the Shape interface
interface Shape {
    double getArea(); // abstract method
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class
class Program270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose shape: 1.Rectangle  2.Circle  3.Triangle");
        int choice = sc.nextInt();

        Shape shape = null; // interface reference

        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                shape = new Rectangle(l, w);
                break;

            case 2:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                shape = new Circle(r);
                break;

            case 3:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                shape = new Triangle(b, h);
                break;

            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        // Display area
        System.out.println("Area = " + shape.getArea());

        sc.close();
    }
}
