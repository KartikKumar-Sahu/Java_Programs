import java.util.Scanner;

public class Program56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Checking leap year condition
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
