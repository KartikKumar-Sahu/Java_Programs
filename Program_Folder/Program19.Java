import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Display the result
        System.out.println(totalSeconds + " seconds is equivalent to: "
                + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");

        // Close the scanner
        scanner.close();
    }
}
