import java.util.Scanner;

public class Program55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter week day number (1-7): ");
        int day = sc.nextInt();

        String dayName;

        // Using switch-case to determine day name
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
        }

        // Display result
        System.out.println("\n----- Day Finder -----");
        System.out.println("Day Number: " + day);
        System.out.println("Day Name: " + dayName);

        sc.close();
    }
}
