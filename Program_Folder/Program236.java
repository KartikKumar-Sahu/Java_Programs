// Program236.java
class Shape {
    double getArea() {
        System.out.println("Area of shape is not defined");
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding getArea() method
    @Override
    double getArea() {
        return length * width;
    }
}

public class Program236 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.getArea();

        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
