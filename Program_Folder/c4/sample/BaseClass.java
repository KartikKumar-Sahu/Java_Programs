package c4.sample;

public class BaseClass {
    protected String name = "Kartik";
    protected String dept = "Computer Science";
    protected double salary = 50000.00;

    protected void displayInfo() {
        System.out.println("----- Protected Method from BaseClass -----");
        System.out.println("Name   : " + name);
        System.out.println("Dept   : " + dept);
        System.out.println("Salary : " + salary);
    }
}
