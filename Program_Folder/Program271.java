// Define the Animal interface
interface Animal {
    void bark(); // abstract method
}

// Dog class implementing Animal
class Dog implements Animal {
    // Implement the bark() method
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
class Program271 {
    public static void main(String[] args) {
        // Create Dog object
        Dog dog = new Dog();
        
        // Call the bark method
        dog.bark();
    }
}
