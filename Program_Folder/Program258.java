// Program258.java

abstract class Bird {
    // Abstract methods
    abstract void fly();
    abstract void makeSound();
}

// Subclass: Eagle
class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle flies high in the sky with powerful wings.");
    }

    @Override
    void makeSound() {
        System.out.println("Eagle makes a sharp, loud screeching sound.");
    }
}

// Subclass: Hawk
class Hawk extends Bird {
    @Override
    void fly() {
        System.out.println("Hawk glides swiftly while scanning for prey.");
    }

    @Override
    void makeSound() {
        System.out.println("Hawk emits a high-pitched 'kreeee' sound.");
    }
}

// Main class
public class Program258 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        System.out.println("---- Eagle ----");
        eagle.fly();
        eagle.makeSound();

        System.out.println();

        System.out.println("---- Hawk ----");
        hawk.fly();
        hawk.makeSound();
    }
}
