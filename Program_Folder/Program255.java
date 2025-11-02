// Program255.java

abstract class Person {
    // Abstract methods
    abstract void eat();
    abstract void exercise();
}

// Subclass: Athlete
class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Athlete eats a balanced diet with high protein and low fat.");
    }

    @Override
    void exercise() {
        System.out.println("Athlete exercises daily with running, weight training, and yoga.");
    }
}

// Subclass: LazyPerson
class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("Lazy person eats junk food while watching TV.");
    }

    @Override
    void exercise() {
        System.out.println("Lazy person avoids exercise and prefers taking naps.");
    }
}

public class Program255 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        System.out.println("---- Athlete ----");
        athlete.eat();
        athlete.exercise();

        System.out.println();

        System.out.println("---- Lazy Person ----");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
