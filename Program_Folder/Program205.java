// Program205.java
import java.util.Scanner;

public class Program205 {

    // Method to display the middle character(s) of a string
    public static void displayMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length == 0) {
            System.out.println("String is empty!");
            return;
        }

        if (length % 2 == 0) {
            // Even length → one middle character
            System.out.println("Middle character: " + str.charAt(middle));
        } else {
            // Odd length → two middle characters
            System.out.println("Middle characters: " + str.charAt(middle - 1) + ", " + str.charAt(middle));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        displayMiddleCharacter(input);

        sc.close();
    }
}
