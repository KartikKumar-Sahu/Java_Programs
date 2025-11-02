// Program243.java

// Base class
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    // Constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return salary * 0.05; // Base 5% bonus
    }

    // Method to generate performance report
    public void generatePerformanceReport() {
        System.out.println(name + " (" + jobTitle + "): Performance is satisfactory.");
    }

    // Method to manage project
    public void manageProject() {
        System.out.println(jobTitle + " " + name + " is contributing to project management.");
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

// Subclass: Manager
class Manager extends Employee {

    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus for managers
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " has demonstrated excellent leadership and coordination.");
    }

    @Override
    public void manageProject() {
        System.out.println("Manager " + name + " is overseeing the entire project execution.");
    }
}

// Subclass: Developer
class Developer extends Employee {

    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus for developers
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " has written high-quality, efficient code this quarter.");
    }

    @Override
    public void manageProject() {
        System.out.println("Developer " + name + " is handling module development and integration.");
    }
}

// Subclass: Programmer
class Programmer extends Employee {

    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08; // 8% bonus for programmers
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " has completed assigned programming tasks successfully.");
    }

    @Override
    public void manageProject() {
        System.out.println("Programmer " + name + " is debugging and optimizing project code.");
    }
}

// Main class
public class Program243 {
    public static void main(String[] args) {

        // Create employee objects
        Manager manager = new Manager("Ravi Sharma", "Delhi", 120000);
        Developer developer = new Developer("Amit Verma", "Mumbai", 90000);
        Programmer programmer = new Programmer("Kartik Kumar", "Chandigarh", 70000);

        // Display and test Manager
        System.out.println("=== Manager Details ===");
        manager.displayInfo();
        System.out.println("Bonus: ₹" + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.manageProject();
        System.out.println();

        // Display and test Developer
        System.out.println("=== Developer Details ===");
        developer.displayInfo();
        System.out.println("Bonus: ₹" + developer.calculateBonus());
        developer.generatePerformanceReport();
        developer.manageProject();
        System.out.println();

        // Display and test Programmer
        System.out.println("=== Programmer Details ===");
        programmer.displayInfo();
        System.out.println("Bonus: ₹" + programmer.calculateBonus());
        programmer.generatePerformanceReport();
        programmer.manageProject();
    }
}
