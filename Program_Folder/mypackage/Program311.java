
package mypackage;

public class Program311 {
    public static void main(String[] args) {
        System.out.println("Accessing multiple default classes within the same package:\n");

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.displayA();
        b.displayB();
        c.displayC();
    }
}

