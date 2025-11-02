// Define the Drawable interface
interface Drawable {
    void draw(); // abstract method
}

// Circle class implementing Drawable
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class implementing Drawable
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Triangle class implementing Drawable
class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class
class Program275 {
    public static void main(String[] args) {
        // Create Drawable objects
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        // Call draw() on each object
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
