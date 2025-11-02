// Program245.java

class Animal {
    Animal() {
        System.out.println("Animal class constructor called.");
    }
}

class Dog extends Animal {
    Dog() {
        // Calling parent class constructor using super()
        super();
        System.out.println("Dog class constructor called.");
    }
}

public class Program245 {
    public static void main(String[] args) {
        Dog d = new Dog(); // Creates Dog object
    }
}
