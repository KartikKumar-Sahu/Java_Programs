// Program257.java

abstract class Shape2D {
    // Abstract methods
    abstract void draw();
    abstract void resize(int newSize);
}

// Subclass: Rectangle
class Rectangle extends Shape2D {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle with width: " + width + " and height: " + height);
    }

    @Override
    void resize(int newSize) {
        width += newSize;
        height += newSize;
        System.out.println("Resized rectangle to width: " + width + " and height: " + height);
    }
}

// Subclass: Circle
class Circle extends Shape2D {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    @Override
    void resize(int newSize) {
        radius += newSize;
        System.out.println("Resized circle to radius: " + radius);
    }
}

public class Program257 {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle(10, 5);
        Shape2D circle = new Circle(7);

        System.out.println("---- Rectangle ----");
        rectangle.draw();
        rectangle.resize(3);

        System.out.println();

        System.out.println("---- Circle ----");
        circle.draw();
        circle.resize(2);
    }
}
