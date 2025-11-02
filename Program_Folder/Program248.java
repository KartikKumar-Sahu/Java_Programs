// Program248.java

abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("The lion roars!");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("The tiger growls!");
    }
}

public class Program248 {
    public static void main(String[] args) {
        Animal lion = new Lion();   // Upcasting
        Animal tiger = new Tiger(); // Upcasting

        lion.sound();
        tiger.sound();
    }
}
