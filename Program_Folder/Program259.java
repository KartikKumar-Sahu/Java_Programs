// Program259.java

abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

// Subclass: Triangle
class Triangle extends GeometricShape {
    double a, b, c; // sides of the triangle

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

// Subclass: Square
class Square extends GeometricShape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

// Main Class
public class Program259 {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(3, 4, 5);
        GeometricShape square = new Square(4);

        System.out.println("---- Triangle ----");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());

        System.out.println();

        System.out.println("---- Square ----");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}
