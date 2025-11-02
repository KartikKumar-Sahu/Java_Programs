// Program240.java
class Person {
    private String firstName;
    private String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get last name
    public String getLastName() {
        return lastName;
    }
}

// Subclass Employee
class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    // Constructor
    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    // New method in subclass
    public String getEmployeeId() {
        return employeeId;
    }

    // Overriding getLastName to include job title
    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

// Main class
public class Program240 {
    public static void main(String[] args) {
        Person person = new Person("Amit", "Sharma");
        Employee employee = new Employee("Raj", "Verma", "E102", "Software Engineer");

        System.out.println("Person Details:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        System.out.println("\nEmployee Details:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
