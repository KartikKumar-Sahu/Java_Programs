// Program360.java
// Example of Default Constructor in Java

class Program360 {

    // Instance variables
    String name;
    int age;

    // Default constructor (no parameters)
    Program360() {
        name = "John Doe";
        age = 25;
        System.out.println("Default constructor called!");
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object will automatically call the default constructor
        Program360 person = new Program360();
        person.display();
    }
}
