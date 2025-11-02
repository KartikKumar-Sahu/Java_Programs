// Program371.java
// Program to demonstrate encapsulation using a Car class

class Car {

    // Private instance variables
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    // Setter and getter for company_name
    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public String getCompanyName() {
        return company_name;
    }

    // Setter and getter for model_name
    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    public String getModelName() {
        return model_name;
    }

    // Setter and getter for year
    public void setYear(int year) {
        if (year > 1885 && year <= 2025) {  // basic validation for realistic car years
            this.year = year;
        } else {
            System.out.println("Invalid year! Please enter a valid car manufacturing year.");
        }
    }

    public int getYear() {
        return year;
    }

    // Getter for mileage (read-only)
    public double getMileage() {
        return mileage;
    }

    // Private method to set mileage internally (simulating system tracking)
    private void setMileage(double mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        }
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Company: " + company_name);
        System.out.println("Model: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km/l");
    }

    // Constructor to initialize the car
    public Car(String company_name, String model_name, int year, double mileage) {
        setCompanyName(company_name);
        setModelName(model_name);
        setYear(year);
        setMileage(mileage);  // internal assignment
    }
}

// Main class
public class Program371 {
    public static void main(String[] args) {

        // Create Car object
        Car car1 = new Car("Toyota", "Corolla", 2022, 18.5);

        // Display details
        System.out.println("=== Car Information ===");
        car1.displayInfo();

        // Access individual details using getters
        System.out.println("\nAccessing individually:");
        System.out.println("Company: " + car1.getCompanyName());
        System.out.println("Model: " + car1.getModelName());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage() + " km/l");

        // Modify details using setters
        System.out.println("\nUpdating car information...");
        car1.setCompanyName("Honda");
        car1.setModelName("Civic");
        car1.setYear(2024);

        // Display updated info
        System.out.println("\n=== Updated Car Information ===");
        car1.displayInfo();
    }
}
