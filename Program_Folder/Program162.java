import java.util.Date;
import java.sql.Timestamp;

public class Program162 {

    public static void main(String[] args) {

        // Create a Date object (current date and time)
        Date date = new Date();

        // Convert Date to Timestamp
        Timestamp timestamp = new Timestamp(date.getTime());

        System.out.println("Date: " + date);
        System.out.println("Timestamp: " + timestamp);
    }
}
