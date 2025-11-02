// Program244.java

// Parent class
class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        // Calling parent class constructor
        super();
        System.out.println("Dog constructor called");
    }

    void displayColor() {
        // Using super keyword to access parent class variable
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }

    void eat() {
        System.out.println("Dog is eating bread...");
    }

    void show() {
        // Calling parent class method using super
        super.eat();
        eat();
    }
}

// Main class
public class Program244 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayColor();
        d.show();
    }
}
