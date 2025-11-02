import java.util.Scanner;

public class Program72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        // Removing leading and trailing whitespaces
        String trimmedString = input.trim();

        // Displaying the result
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Trimmed String: \"" + trimmedString + "\"");

        sc.close();
    }
}
