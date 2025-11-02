// Program348.java
public class Program348 {

    // --- TrafficLight class ---
    static class TrafficLight {
        // Attributes
        private String color;     // Current color of the light
        private int duration;     // Duration in seconds

        // Constructor
        public TrafficLight(String color, int duration) {
            this.color = color;
            this.duration = duration;
        }

        // Getter methods
        public String getColor() {
            return color;
        }

        public int getDuration() {
            return duration;
        }

        // Method to change the light color
        public void changeColor(String newColor, int newDuration) {
            color = newColor;
            duration = newDuration;
            System.out.println("🔄 Light changed to " + color.toUpperCase() + " for " + duration + " seconds.");
        }

        // Method to check if the light is red
        public boolean isRed() {
            return color.equalsIgnoreCase("red");
        }

        // Method to check if the light is green
        public boolean isGreen() {
            return color.equalsIgnoreCase("green");
        }

        // Display current light details
        public void displayInfo() {
            System.out.println("Current Light: " + color.toUpperCase() + " | Duration: " + duration + " seconds");
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        // Create a traffic light object
        TrafficLight light = new TrafficLight("Red", 30);

        System.out.println("=== Initial Traffic Light ===");
        light.displayInfo();

        // Check light status
        System.out.println("\nIs Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());

        // Change color to Yellow
        System.out.println("\n--- Changing Light ---");
        light.changeColor("Yellow", 5);

        // Change color to Green
        System.out.println("\n--- Changing Light ---");
        light.changeColor("Green", 25);

        // Check again
        System.out.println("\nIs Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());

        // Display final light state
        System.out.println("\n=== Final Traffic Light State ===");
        light.displayInfo();
    }
}
