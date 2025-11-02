// Program343.java
public class Program343 {

    // Define the Rectangle class
    static class Rectangle {
        // Attributes
        private double width;
        private double height;

        // Constructor
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Method to calculate area
        public double getArea() {
            return width * height;
        }

        // Method to calculate perimeter
        public double getPerimeter() {
            return 2 * (width + height);
        }

        // Display details
        public void displayInfo() {
            System.out.println("Width: " + width + ", Height: " + height);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a few Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 4.2);

        System.out.println("=== Rectangle 1 ===");
        rect1.displayInfo();

        System.out.println("\n=== Rectangle 2 ===");
        rect2.displayInfo();
    }
}
