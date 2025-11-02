// Program242.java
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    // Constructor
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Method to calculate fuel efficiency (in km/l)
    public double getFuelEfficiency() {
        return 0.0;
    }

    // Method to calculate distance traveled
    public double calculateDistance(double fuelUsed) {
        return fuelUsed * getFuelEfficiency();
    }

    // Method to get max speed
    public double getMaxSpeed() {
        return 0.0;
    }

    // Display vehicle details
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double getFuelEfficiency() {
        return 15.0; // km/l
    }

    @Override
    public double getMaxSpeed() {
        return 180.0; // km/h
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double getFuelEfficiency() {
        return 8.0; // km/l
    }

    @Override
    public double getMaxSpeed() {
        return 120.0; // km/h
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double getFuelEfficiency() {
        return 35.0; // km/l
    }

    @Override
    public double getMaxSpeed() {
        return 150.0; // km/h
    }
}

// Main class
public class Program242 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2023, "Petrol");
        Truck truck = new Truck("Tata", "Prima", 2022, "Diesel");
        Motorcycle bike = new Motorcycle("Yamaha", "R15", 2024, "Petrol");

        System.out.println("=== Car Details ===");
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.getFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled (for 10L fuel): " + car.calculateDistance(10) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h\n");

        System.out.println("=== Truck Details ===");
        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.getFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled (for 10L fuel): " + truck.calculateDistance(10) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h\n");

        System.out.println("=== Motorcycle Details ===");
        bike.displayInfo();
        System.out.println("Fuel Efficiency: " + bike.getFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled (for 10L fuel): " + bike.calculateDistance(10) + " km");
        System.out.println("Max Speed: " + bike.getMaxSpeed() + " km/h");
    }
}
