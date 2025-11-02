// Program356.java
abstract class Shape {
    // Abstract methods (must be implemented by subclasses)
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method (common for all shapes)
    public void display() {
        System.out.println("Shape details:");
    }
}

// --- Rectangle subclass ---
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void display() {
        System.out.println("🟩 Rectangle:");
        System.out.println("Width = " + width + ", Height = " + height);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("--------------------------------");
    }
}

// --- Circle subclass ---
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void display() {
        System.out.println("⚪ Circle:");
        System.out.println("Radius = " + radius);
        System.out.printf("Area = %.2f%n", calculateArea());
        System.out.printf("Perimeter = %.2f%n", calculatePerimeter());
        System.out.println("--------------------------------");
    }
}

// --- Triangle subclass ---
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void display() {
        System.out.println("🔺 Triangle:");
        System.out.println("Sides = " + sideA + ", " + sideB + ", " + sideC);
        System.out.printf("Area = %.2f%n", calculateArea());
        System.out.printf("Perimeter = %.2f%n", calculatePerimeter());
        System.out.println("--------------------------------");
    }
}

// --- Main class ---
public class Program356 {
    public static void main(String[] args) {
        // Create shape objects
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4, 5);

        // Display details for each shape
        System.out.println("=== Shape Calculations ===");
        rectangle.display();
        circle.display();
        triangle.display();
    }
}
