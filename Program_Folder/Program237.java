// Program237.java
class Employee {
    double salary = 50000;

    void work() {
        System.out.println("Employee is working...");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    // Overriding work() method
    @Override
    void work() {
        System.out.println("HR Manager is managing employee relations and recruitment...");
    }

    // New method specific to HRManager
    void addEmployee() {
        System.out.println("HR Manager is adding a new employee to the system.");
    }
}

public class Program237 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee Salary: " + emp.getSalary());

        System.out.println("------------------------------");

        HRManager hr = new HRManager();
        hr.work();
        System.out.println("HR Manager Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}
