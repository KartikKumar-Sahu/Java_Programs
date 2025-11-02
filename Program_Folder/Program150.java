import java.util.Scanner;

public class Program150 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Check if string is not empty
        if (str.length() > 0) {
            // Get first character of string
            char ch = str.charAt(0);
            System.out.println("First character: " + ch);
        } else {
            System.out.println("String is empty! Cannot convert to char.");
        }

        sc.close();
    }
}
