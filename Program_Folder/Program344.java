// Program344.java
public class Program344 {

    // Define the Circle class
    static class Circle {
        // Attribute
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Getter for radius
        public double getRadius() {
            return radius;
        }

        // Setter for radius
        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
            } else {
                System.out.println("Radius must be positive!");
            }
        }

        // Method to calculate area
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Method to calculate circumference
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        // Display circle details
        public void displayInfo() {
            System.out.println("Radius: " + radius);
            System.out.printf("Area: %.2f%n", getArea());
            System.out.printf("Circumference: %.2f%n", getCircumference());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle1 = new Circle(5.0);

        System.out.println("=== Original Circle Details ===");
        circle1.displayInfo();

        // Modify the radius
        circle1.setRadius(7.5);

        System.out.println("\n=== Updated Circle Details ===");
        circle1.displayInfo();
    }
}
