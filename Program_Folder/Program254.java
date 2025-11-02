// Program254.java

abstract class Vehicle {
    // Abstract methods
    abstract void startEngine();
    abstract void stopEngine();
}

// Subclass: Car
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started: Vroom Vroom!");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started: Broom Broom!");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Program254 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("---- Car ----");
        car.startEngine();
        car.stopEngine();

        System.out.println();

        System.out.println("---- Motorcycle ----");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
