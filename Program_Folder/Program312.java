// Program312: Accessing multiple public classes from a package

import mypackage1.*;  // Import all classes from mypackage

public class Program312 {
    public static void main(String[] args) {
        System.out.println("Accessing public classes from mypackage:\n");

        A objA = new A();
        B objB = new B();
        C objC = new C();
        D objD = new D();

        objA.showA();
        objB.showB();
        objC.showC();
        objD.showD();
    }
}
