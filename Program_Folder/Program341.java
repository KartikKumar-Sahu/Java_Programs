// Program341.java
public class Program341 {

    // Define the Person class
    static class Person {
        // Attributes
        private String name;
        private int age;

        // Constructor to initialize name and age
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display the person's details
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create two Person objects using the constructor
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Print their details
        System.out.println("=== Person Details ===");
        person1.displayInfo();
        person2.displayInfo();
    }
}
