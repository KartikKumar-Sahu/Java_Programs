// Program370.java
// Program to demonstrate encapsulation and computation in a Circle class

class Circle {

    // Private instance variable
    private double radius;

    // Setter method with validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius! It must be positive.");
        }
    }

    // Getter method
    public double getRadius() {
        return radius;
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Display circle details
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
    }
}

// Main class
public class Program370 {
    public static void main(String[] args) {

        // Create a Circle object
        Circle c1 = new Circle();

        // Set radius using setter
        c1.setRadius(7.5);

        // Display circle details
        System.out.println("=== Circle Details ===");
        c1.displayInfo();

        // Access individual values
        System.out.println("\nAccessing values individually:");
        System.out.println("Radius = " + c1.getRadius());
        System.out.printf("Area = %.2f%n", c1.calculateArea());
        System.out.printf("Perimeter = %.2f%n", c1.calculatePerimeter());

        // Try setting invalid radius
        System.out.println("\nTrying to set invalid radius...");
        c1.setRadius(-10);
    }
}
