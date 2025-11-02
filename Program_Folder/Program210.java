// Program210.java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program210 {

    // Method to display current date and time
    public static void displayCurrentDateTime() {
        LocalDateTime current = LocalDateTime.now();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted = current.format(formatter);

        System.out.println("Current Date and Time: " + formatted);
    }

    // Main method
    public static void main(String[] args) {
        displayCurrentDateTime();
    }
}
