// Program235.java
class Vehicle {
    void drive() {
        System.out.println("The vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Program235 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        Car c = new Car();
        c.drive();
    }
}
