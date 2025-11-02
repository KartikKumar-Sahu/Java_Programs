import java.util.Scanner;

public class Program71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Converting string to uppercase
        String upperCaseString = input.toUpperCase();

        // Displaying the result
        System.out.println("String in uppercase: " + upperCaseString);

        sc.close();
    }
}
