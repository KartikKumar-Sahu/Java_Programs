import java.util.Scanner;

public class Program78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Taking the character to remove
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        // Removing the character using replace() method
        String result = input.replace(String.valueOf(ch), "");

        // Displaying result
        System.out.println("Original String: " + input);
        System.out.println("String after removing '" + ch + "': " + result);

        sc.close();
    }
}
