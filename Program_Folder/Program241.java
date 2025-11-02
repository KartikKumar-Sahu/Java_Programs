// Program241.java
class Shape {
    // Method to calculate perimeter
    public double getPerimeter() {
        return 0.0;
    }

    // Method to calculate area
    public double getArea() {
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding getPerimeter method
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding getArea method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class Program241 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println("Circle Details:");
        System.out.println("Radius: " + 5.0);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
