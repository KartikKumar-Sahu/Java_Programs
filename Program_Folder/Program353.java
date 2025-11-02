// Program353.java
import java.util.ArrayList;

public class Program353 {

    // --- Product class ---
    static class Product {
        private String name;
        private double price;
        private int quantity;

        // Constructor
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Getters
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        // Setter to update quantity
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        // Display product info
        public void displayInfo() {
            System.out.printf("📦 Product: %-15s | Price: $%.2f | Quantity: %d%n",
                              name, price, quantity);
        }
    }

    // --- Inventory class ---
    static class Inventory {
        private ArrayList<Product> products;

        // Constructor
        public Inventory() {
            products = new ArrayList<>();
        }

        // Add a product
        public void addProduct(Product product) {
            products.add(product);
            System.out.println("✅ Added: " + product.getName());
        }

        // Remove a product by name
        public void removeProduct(String name) {
            boolean removed = false;
            for (Product p : products) {
                if (p.getName().equalsIgnoreCase(name)) {
                    products.remove(p);
                    System.out.println("🗑️ Removed: " + name);
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("⚠️ Product not found: " + name);
            }
        }

        // Display all products
        public void displayInventory() {
            System.out.println("\n=== Inventory List ===");
            if (products.isEmpty()) {
                System.out.println("📭 No products in inventory.");
            } else {
                for (Product p : products) {
                    p.displayInfo();
                }
            }
        }

        // Check for low inventory (below threshold)
        public void checkLowInventory(int threshold) {
            System.out.println("\n🔍 Checking for low inventory (Threshold: " + threshold + ")");
            boolean lowFound = false;
            for (Product p : products) {
                if (p.getQuantity() <= threshold) {
                    System.out.printf("⚠️ LOW STOCK: %-15s (Quantity: %d)%n", p.getName(), p.getQuantity());
                    lowFound = true;
                }
            }
            if (!lowFound) {
                System.out.println("✅ All products are sufficiently stocked.");
            }
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Create products
        Product p1 = new Product("Laptop", 1200.00, 5);
        Product p2 = new Product("Mouse", 25.50, 2);
        Product p3 = new Product("Keyboard", 45.00, 10);
        Product p4 = new Product("Monitor", 250.00, 1);

        // Add products
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);

        // Display all products
        inventory.displayInventory();

        // Check for low inventory (threshold = 3)
        inventory.checkLowInventory(3);

        // Remove a product
        System.out.println("\n--- Removing a Product ---");
        inventory.removeProduct("Mouse");

        // Display updated inventory
        inventory.displayInventory();

        // Check again for low inventory
        inventory.checkLowInventory(3);
    }
}
