// Program396.java
// Program to check if a string contains only digits

import java.util.Scanner;

public class Program396 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Method 1: Using built-in method (Character.isDigit)
        boolean isDigitOnly = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isDigitOnly = false;
                break;
            }
        }

        // Display result
        if (isDigitOnly)
            System.out.println("The string contains only digits.");
        else
            System.out.println("The string contains non-digit characters.");

        sc.close();
    }
}
