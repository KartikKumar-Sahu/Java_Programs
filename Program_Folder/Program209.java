// Program209.java
import java.util.Scanner;

public class Program209 {

    // Method to check if a password is valid
    public static boolean isValidPassword(String password) {
        // Password rules:
        // 1. At least 8 characters
        // 2. Must contain at least one uppercase letter
        // 3. Must contain at least one lowercase letter
        // 4. Must contain at least one digit
        // 5. Must contain at least one special character

        if (password.length() < 8)
            return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else
                hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        if (isValidPassword(password))
            System.out.println("Valid Password ✅");
        else
            System.out.println("Invalid Password ❌ (Must have 8+ chars, uppercase, lowercase, digit & special character)");

        sc.close();
    }
}
