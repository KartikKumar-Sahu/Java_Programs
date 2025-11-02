import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program148 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (format: dd-MM-yyyy): ");
        String dateString = sc.nextLine();

        // Define date format
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Converting String to Date
            Date date = formatter.parse(dateString);
            System.out.println("Converted Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format! Please use dd-MM-yyyy.");
        }

        sc.close();
    }
}
