import java.util.Scanner;

public class Program125 {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions:
        // 1. Year divisible by 4 and not by 100, OR
        // 2. Year divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
