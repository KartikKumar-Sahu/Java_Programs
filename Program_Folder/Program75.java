import java.util.Scanner;

public class Program75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Getting length of the string
        int length = input.length();

        // Displaying result
        System.out.println("The length of the given string is: " + length);

        sc.close();
    }
}
