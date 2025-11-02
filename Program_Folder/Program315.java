// Program315: Accessing protected members from nested package through inheritance

import c4.sample.BaseClass;  // import the class from nested package

class DerivedClass extends BaseClass {
    public void showDetails() {
        System.out.println("Accessing protected members from subclass (different package):");
        System.out.println("Name   : " + name);
        System.out.println("Dept   : " + dept);
        System.out.println("Salary : " + salary);
        displayInfo(); // calling protected method
    }
}

public class Program315 {
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.showDetails();
    }
}
