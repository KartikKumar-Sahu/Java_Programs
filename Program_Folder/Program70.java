import java.util.Scanner;

public class Program70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Converting string to lowercase
        String lowerCaseString = input.toLowerCase();

        // Displaying the result
        System.out.println("String in lowercase: " + lowerCaseString);

        sc.close();
    }
}
