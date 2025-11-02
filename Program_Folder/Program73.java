import java.util.Scanner;

public class Program73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter starting position (0-based index): ");
        int start = sc.nextInt();

        System.out.print("Enter ending position: ");
        int end = sc.nextInt();

        // Checking for valid range
        if (start < 0 || end > input.length() || start >= end) {
            System.out.println("Invalid positions! Please check your input.");
        } else {
            // Extracting substring
            String substring = input.substring(start, end);
            System.out.println("Substring between positions " + start + " and " + end + " is: " + substring);
        }

        sc.close();
    }
}
