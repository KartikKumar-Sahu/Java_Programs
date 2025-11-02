// Define the Playable interface
interface Playable {
    void play(); // abstract method
}

// Football class implementing Playable
class Football implements Playable {
    public void play() {
        System.out.println("Playing Football on the field!");
    }
}

// Volleyball class implementing Playable
class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball on the beach!");
    }
}

// Basketball class implementing Playable
class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball on the court!");
    }
}

// Main class
class Program277 {
    public static void main(String[] args) {
        // Create Playable objects
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call play() for each sport
        football.play();
        volleyball.play();
        basketball.play();
    }
}
