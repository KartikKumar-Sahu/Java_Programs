// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement resizeWidth
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + width);
    }

    // Implement resizeHeight
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + height);
    }

    // Display current dimensions
    public void displayDimensions() {
        System.out.println("Rectangle dimensions: " + width + " x " + height);
    }
}

// Main class
class Program274 {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(50, 30);

        // Display initial dimensions
        System.out.println("Initial:");
        rect.displayDimensions();

        // Resize width and height
        rect.resizeWidth(100);
        rect.resizeHeight(60);

        // Display new dimensions
        System.out.println("After resizing:");
        rect.displayDimensions();
    }
}
