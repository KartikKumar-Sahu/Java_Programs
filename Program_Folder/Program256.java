// Program256.java

abstract class Instrument {
    // Abstract methods
    abstract void play();
    abstract void tune();
}

// Subclass: Glockenspiel
class Glockenspiel extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the glockenspiel with metal bars and mallets producing bright tones.");
    }

    @Override
    void tune() {
        System.out.println("Tuning the glockenspiel by adjusting bar lengths and resonator tubes.");
    }
}

// Subclass: Violin
class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the violin with a bow to produce smooth, melodious notes.");
    }

    @Override
    void tune() {
        System.out.println("Tuning the violin by adjusting the tension of the strings using tuning pegs.");
    }
}

public class Program256 {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();

        System.out.println("---- Glockenspiel ----");
        glockenspiel.play();
        glockenspiel.tune();

        System.out.println();

        System.out.println("---- Violin ----");
        violin.play();
        violin.tune();
    }
}
