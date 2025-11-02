// Program342.java
public class Program342 {

    // Define the Dog class
    static class Dog {
        // Attributes
        private String name;
        private String breed;

        // Constructor
        public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for breed
        public String getBreed() {
            return breed;
        }

        // Setter for breed
        public void setBreed(String breed) {
            this.breed = breed;
        }

        // Method to display Dog details
        public void displayInfo() {
            System.out.println("Name: " + name + ", Breed: " + breed);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create two Dog objects using the constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Beagle");

        System.out.println("=== Original Dog Details ===");
        dog1.displayInfo();
        dog2.displayInfo();

        // Modify attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("German Shepherd");

        System.out.println("\n=== Updated Dog Details ===");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
