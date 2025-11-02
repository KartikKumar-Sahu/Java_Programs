import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get current date
        Date date = new Date();

        System.out.println("Current Date (raw format): " + date);

        // Ask user for desired format
        System.out.print("Enter desired date format (e.g., dd-MM-yyyy or yyyy/MM/dd): ");
        String format = sc.nextLine();

        // Define date format
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        // Convert Date to String
        String dateString = formatter.format(date);

        System.out.println("Formatted Date String: " + dateString);

        sc.close();
    }
}
