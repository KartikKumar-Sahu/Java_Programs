// Program366.java
// Program to demonstrate encapsulation using getters and setters

class Person {

    // Private instance variables (encapsulation)
    private String name;
    private int age;
    private String country;

    // Public getter and setter for 'name'
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Public getter and setter for 'age'
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {  // simple validation
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    // Public getter and setter for 'country'
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

// Main class
public class Program366 {
    public static void main(String[] args) {

        // Create a Person object
        Person p1 = new Person();

        // Set values using setter methods
        p1.setName("Alice");
        p1.setAge(25);
        p1.setCountry("USA");

        // Display information using getter methods and custom method
        System.out.println("=== Person Information ===");
        p1.displayInfo();

        // Access individual values using getters
        System.out.println("\nAccessing values individually:");
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Country: " + p1.getCountry());
    }
}
