// Program361.java
// Example of Parameterized Constructor in Java

class Program361 {

    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    Program361(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called!");
    }

    // Method to display the details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Program361 person1 = new Program361("Alice", 22);
        Program361 person2 = new Program361("Bob", 30);

        // Displaying details
        person1.display();
        person2.display();
    }
}
