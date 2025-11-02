package mydemo;

public class PublicClass {
    // Public data members
    public String name = "Kartik Sharma";
    public String designation = "Software Developer";
    public double salary = 65000.00;

    // Public method
    public void displayInfo() {
        System.out.println("----- Employee Information (Public Members) -----");
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
    }
}
