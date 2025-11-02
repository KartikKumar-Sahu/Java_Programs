// Program346.java
public class Program346 {

    // Define the Employee class
    static class Employee {
        // Attributes
        private String name;
        private String jobTitle;
        private double salary;

        // Constructor
        public Employee(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        // Getter for salary
        public double getSalary() {
            return salary;
        }

        // Method to increase salary by percentage
        public void increaseSalary(double percentage) {
            if (percentage > 0) {
                double increase = (salary * percentage) / 100;
                salary += increase;
                System.out.println("✅ Salary increased by " + percentage + "% (" + increase + ")");
            } else {
                System.out.println("⚠️ Percentage must be positive!");
            }
        }

        // Method to set a new salary
        public void setSalary(double newSalary) {
            if (newSalary > 0) {
                salary = newSalary;
                System.out.println("💰 Salary updated to: " + newSalary);
            } else {
                System.out.println("⚠️ Invalid salary amount!");
            }
        }

        // Method to display employee details
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Job Title: " + jobTitle);
            System.out.println("Current Salary: " + salary);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("Alice Johnson", "Software Engineer", 55000);
        Employee emp2 = new Employee("Bob Williams", "Project Manager", 70000);

        System.out.println("=== Employee Details ===");
        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();

        // Increase and update salary
        System.out.println("\n--- Updating Salaries ---");
        emp1.increaseSalary(10);  // Increase by 10%
        emp2.setSalary(75000);    // Set new salary

        System.out.println("\n=== Updated Employee Details ===");
        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
    }
}
