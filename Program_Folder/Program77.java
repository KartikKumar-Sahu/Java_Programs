import java.util.Scanner;

public class Program77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Taking index input from user
        System.out.print("Enter the index (0-based): ");
        int index = sc.nextInt();

        // Checking for valid index
        if (index < 0 || index >= input.length()) {
            System.out.println("Invalid index! Please enter a value between 0 and " + (input.length() - 1));
        } else {
            // Getting character at specified index
            char character = input.charAt(index);
            System.out.println("Character at index " + index + " is: " + character);
        }

        sc.close();
    }
}
