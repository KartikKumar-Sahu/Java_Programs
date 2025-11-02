// Program247.java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Program247 {
    public static void main(String[] args) {
        Animal a;  // Reference of parent class

        a = new Dog();  // a refers to Dog object
        a.sound();      // Calls Dog's version of sound()

        a = new Cat();  // a now refers to Cat object
        a.sound();      // Calls Cat's version of sound()
    }
}
