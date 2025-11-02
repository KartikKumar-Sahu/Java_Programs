// Program358.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program358 {

    // --- Restaurant class ---
    static class Restaurant {
        private String name;
        private Map<String, Double> menu;         // item → price
        private ArrayList<Double> ratings;        // list of ratings (1–5)

        // Constructor
        public Restaurant(String name) {
            this.name = name;
            this.menu = new HashMap<>();
            this.ratings = new ArrayList<>();
        }

        // Add a menu item
        public void addMenuItem(String item, double price) {
            if (!menu.containsKey(item)) {
                menu.put(item, price);
                System.out.println("✅ Added item: " + item + " ($" + price + ")");
            } else {
                System.out.println("⚠️ Item already exists: " + item);
            }
        }

        // Remove a menu item
        public void removeMenuItem(String item) {
            if (menu.containsKey(item)) {
                menu.remove(item);
                System.out.println("🗑️ Removed item: " + item);
            } else {
                System.out.println("⚠️ Item not found: " + item);
            }
        }

        // Add a customer rating
        public void addRating(double rating) {
            if (rating >= 1 && rating <= 5) {
                ratings.add(rating);
                System.out.println("⭐ New rating added: " + rating);
            } else {
                System.out.println("⚠️ Rating must be between 1 and 5.");
            }
        }

        // Calculate average rating
        public double calculateAverageRating() {
            if (ratings.isEmpty()) return 0;
            double total = 0;
            for (double r : ratings) {
                total += r;
            }
            return total / ratings.size();
        }

        // Display the menu
        public void displayMenu() {
            System.out.println("\n=== 🍔 " + name + " Menu ===");
            if (menu.isEmpty()) {
                System.out.println("No items on the menu.");
            } else {
                for (String item : menu.keySet()) {
                    System.out.println("- " + item + " : $" + String.format("%.2f", menu.get(item)));
                }
            }
        }

        // Display restaurant info
        public void displayRestaurantInfo() {
            System.out.println("\n=== 🏪 Restaurant Information ===");
            System.out.println("Name: " + name);
            System.out.printf("Average Rating: %.2f ⭐%n", calculateAverageRating());
            displayMenu();
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        // Create restaurant object
        Restaurant r1 = new Restaurant("Tasty Bites");

        // Add menu items
        r1.addMenuItem("Burger", 8.99);
        r1.addMenuItem("Pizza", 12.50);
        r1.addMenuItem("Pasta", 10.00);
        r1.addMenuItem("Fries", 3.99);

        // Display menu
        r1.displayMenu();

        // Remove one item
        System.out.println("\n--- Removing Item ---");
        r1.removeMenuItem("Fries");

        // Add customer ratings
        System.out.println("\n--- Adding Ratings ---");
        r1.addRating(4.5);
        r1.addRating(5);
        r1.addRating(3.8);
        r1.addRating(4.2);

        // Display restaurant info
        r1.displayRestaurantInfo();
    }
}
