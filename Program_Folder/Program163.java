import java.util.Date;
import java.sql.Timestamp;

public class Program163 {

    public static void main(String[] args) {

        // Create a Timestamp object (current time)
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // Convert Timestamp to Date
        Date date = new Date(timestamp.getTime());

        System.out.println("Timestamp: " + timestamp);
        System.out.println("Date: " + date);
    }
}
