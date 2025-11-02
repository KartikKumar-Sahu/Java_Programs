// Program314: Accessing protected members from another package through inheritance

import mypack.Parent;

class Child extends Parent {   // subclass in another package
    public void show() {
        System.out.println("Accessing protected members from subclass (different package):");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        displayInfo(); // calling protected method
    }
}

public class Program314 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
