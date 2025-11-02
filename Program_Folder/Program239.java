// Program239.java
class Animal {
    // Method to describe movement
    public void move() {
        System.out.println("Animals can move.");
    }
}

// Subclass Cheetah
class Cheetah extends Animal {
    // Overriding move() method
    @Override
    public void move() {
        System.out.println("Cheetahs can run fast!");
    }
}

// Main class
public class Program239 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Cheetah cheetah = new Cheetah();

        // Calling methods
        genericAnimal.move(); // Calls parent class method
        cheetah.move();       // Calls overridden method
    }
}
