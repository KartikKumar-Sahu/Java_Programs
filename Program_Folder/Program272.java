// Define the Flyable interface
interface Flyable {
    void fly_obj(); // abstract method
}

// Spacecraft class implementing Flyable
class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Airplane class implementing Flyable
class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Helicopter class implementing Flyable
class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is hovering and flying near the ground.");
    }
}

// Main class
class Program272 {
    public static void main(String[] args) {
        // Create objects of each Flyable class
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        // Call fly_obj() for each object
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
