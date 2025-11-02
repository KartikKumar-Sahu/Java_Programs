// Program349.java
import java.time.LocalDate;
import java.time.Period;

public class Program349 {

    // --- Employee class ---
    static class Employee {
        // Attributes
        private String name;
        private double salary;
        private LocalDate hireDate;

        // Constructor
        public Employee(String name, double salary, LocalDate hireDate) {
            this.name = name;
            this.salary = salary;
            this.hireDate = hireDate;
        }

        // Method to calculate years of service
        public int getYearsOfService() {
            LocalDate currentDate = LocalDate.now();
            return Period.between(hireDate, currentDate).getYears();
        }

        // Display employee details
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Salary: $" + salary);
            System.out.println("Hire Date: " + hireDate);
            System.out.println("Years of Service: " + getYearsOfService());
            System.out.println("----------------------------------");
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("Alice Johnson", 65000, LocalDate.of(2018, 5, 12));
        Employee emp2 = new Employee("Bob Williams", 82000, LocalDate.of(2015, 10, 1));
        Employee emp3 = new Employee("Charlie Smith", 50000, LocalDate.of(2021, 2, 20));

        // Display employee details
        System.out.println("=== Employee Details ===");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
