// Program251.java

abstract class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract methods
    abstract void eat();
    abstract void sleep();

    // Common method
    public void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats meat and hunts in the wild.");
    }

    @Override
    void sleep() {
        System.out.println(name + " sleeps for about 20 hours a day in the shade.");
    }
}

class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats large prey such as deer and wild boar.");
    }

    @Override
    void sleep() {
        System.out.println(name + " sleeps for around 18 hours daily near water bodies.");
    }
}

class Deer extends Animal {

    public Deer(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " grazes on grass and leaves.");
    }

    @Override
    void sleep() {
        System.out.println(name + " sleeps lightly and stays alert to predators.");
    }
}

public class Program251 {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion");
        Tiger tiger = new Tiger("Tiger");
        Deer deer = new Deer("Deer");

        System.out.println("--- Animal Behaviors ---");

        lion.display();
        lion.eat();
        lion.sleep();

        System.out.println();

        tiger.display();
        tiger.eat();
        tiger.sleep();

        System.out.println();

        deer.display();
        deer.eat();
        deer.sleep();
    }
}
