// Program310: Inheriting java.util.Date using qualified class name (no import)

class MyDate extends java.util.Date {
    // Inherits all methods from java.util.Date
}

public class Program310 {
    public static void main(String[] args) {
        // Create an object of the subclass MyDate
        MyDate currentDate = new MyDate();

        // Print the current system date and time
        System.out.println("Current System Date and Time: " + currentDate);
    }
}
