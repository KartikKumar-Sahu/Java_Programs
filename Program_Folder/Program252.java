// Program252.java

abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    // Constructor
    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    // Abstract methods
    abstract double calculateSalary();
    abstract void displayInfo();
}

// Subclass: Manager
class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("---- Manager Information ----");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Programmer(String name, int id, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }

    @Override
    void displayInfo() {
        System.out.println("---- Programmer Information ----");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Overtime Rate: " + overtimeRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Program252 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 101, 50000, 15000);
        Programmer programmer = new Programmer("Alice Johnson", 102, 40000, 10, 500);

        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}
