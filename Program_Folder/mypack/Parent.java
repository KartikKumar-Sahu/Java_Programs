package mypack;

public class Parent {
    protected String name = "Kartik";
    protected int age = 25;

    protected void displayInfo() {
        System.out.println("Protected method from Parent class:");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
