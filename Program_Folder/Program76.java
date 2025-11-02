import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program76 {
    public static void main(String[] args) {
        // Getting current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Defining desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Formatting the date and time
        String formattedDateTime = currentDateTime.format(formatter);

        // Displaying result
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
