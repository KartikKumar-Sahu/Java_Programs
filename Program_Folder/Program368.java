// Program368.java
// Program to demonstrate encapsulation using a Rectangle class

class Rectangle {

    // Private instance variables
    private double length;
    private double width;

    // Setter for length with validation
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length! It must be positive.");
        }
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for width with validation
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! It must be positive.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display rectangle details
    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Main class
public class Program368 {
    public static void main(String[] args) {

        // Create a Rectangle object
        Rectangle rect = new Rectangle();

        // Set values using setters
        rect.setLength(10.5);
        rect.setWidth(4.2);

        // Display details
        System.out.println("=== Rectangle Details ===");
        rect.displayInfo();

        // Access values using getters
        System.out.println("\nAccessing individually:");
        System.out.println("Length = " + rect.getLength());
        System.out.println("Width = " + rect.getWidth());

        // Try invalid input
        System.out.println("\nTrying to set invalid dimensions...");
        rect.setLength(-5);
        rect.setWidth(0);
    }
}
