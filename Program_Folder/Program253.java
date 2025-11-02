// Program253.java

abstract class Shape3D {
    // Abstract methods
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

// Subclass: Sphere
class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public void display() {
        System.out.println("---- Sphere ----");
        System.out.println("Radius: " + radius);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}

// Subclass: Cube
class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    public void display() {
        System.out.println("---- Cube ----");
        System.out.println("Side: " + side);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}

public class Program253 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0);
        Cube cube = new Cube(4.0);

        sphere.display();
        System.out.println();
        cube.display();
    }
}
