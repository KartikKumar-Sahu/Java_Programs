import java.util.Scanner;

public class Program53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days = 0;

        // Finding number of days based on month and leap year condition
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                // Leap year check
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month number!");
                sc.close();
                return;
        }

        // Display result
        System.out.println("\n----- Month Details -----");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Number of days: " + days);

        sc.close();
    }
}
