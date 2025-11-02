// Program369.java
// Program to demonstrate encapsulation with formatted getter for salary

import java.text.NumberFormat;

class Employee {

    // Private instance variables
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Setter for employee_id
    public void setEmployeeId(int employee_id) {
        if (employee_id > 0) {
            this.employee_id = employee_id;
        } else {
            System.out.println("Invalid ID! Must be positive.");
        }
    }

    // Getter for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    // Setter for employee_name
    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    // Getter for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    // Setter for employee_salary (private use only)
    public void setEmployeeSalary(double employee_salary) {
        if (employee_salary >= 0) {
            this.employee_salary = employee_salary;
        } else {
            System.out.println("Invalid Salary! Cannot be negative.");
        }
    }

    // Getter for employee_salary (returns formatted string)
    public String getEmployeeSalary() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(employee_salary);
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Employee Salary: " + getEmployeeSalary());
    }
}

// Main class
public class Program369 {
    public static void main(String[] args) {

        // Create an Employee object
        Employee emp = new Employee();

        // Set values using setters
        emp.setEmployeeId(101);
        emp.setEmployeeName("Alice Johnson");
        emp.setEmployeeSalary(55000.75);

        // Display employee details
        System.out.println("=== Employee Details ===");
        emp.displayEmployeeInfo();

        // Access individual values using getters
        System.out.println("\nAccessing individually:");
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());
    }
}
