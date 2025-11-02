// Program362.java
// Example of Copy Constructor in Java

class Program362 {

    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    Program362(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Program362(Program362 other) {
        name = other.name;
        age = other.age;
        System.out.println("Copy constructor called!");
    }

    // Method to display object details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Create original object
        Program362 person1 = new Program362("Alice", 25);

        // Create copy of the first object using copy constructor
        Program362 person2 = new Program362(person1);

        // Display both objects
        System.out.println("Original Object:");
        person1.display();

        System.out.println("\nCopied Object:");
        person2.display();
    }
}
