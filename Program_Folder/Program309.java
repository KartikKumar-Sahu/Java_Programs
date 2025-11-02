// Program309: Inheriting java.util.Date class and printing current date

// Import the Date class from java.util package
import java.util.Date;

// Child class inheriting from Date
class MyDate extends Date {
    // No extra members needed — inherits everything from Date
}

// Main class
public class Program309 {
    public static void main(String[] args) {
        // Create an object of the child class
        MyDate currentDate = new MyDate();

        // Print the current system date and time
        System.out.println("Current System Date and Time: " + currentDate);
    }
}
