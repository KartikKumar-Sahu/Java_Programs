// Program316: Accessing public class and public members from another package

import mydemo.PublicClass;  // import the public class from mydemo package

public class Program316 {
    public static void main(String[] args) {
        // Create an object of the public class
        PublicClass obj = new PublicClass();

        // Access public data members directly
        System.out.println("Accessing public members directly:");
        System.out.println("Name        : " + obj.name);
        System.out.println("Designation : " + obj.designation);
        System.out.println("Salary      : " + obj.salary);

        System.out.println();

        // Access via public method
        obj.displayInfo();
    }
}
