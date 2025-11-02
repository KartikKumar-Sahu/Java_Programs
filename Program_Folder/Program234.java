// Program234.java
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Program234 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}
