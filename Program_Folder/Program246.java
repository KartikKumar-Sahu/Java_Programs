// Program246.java

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    // Overriding the sound() method of parent class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Program246 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Calls Animal's sound()

        Dog d = new Dog();
        d.sound(); // Calls Dog's overridden sound()
    }
}
