import java.util.Scanner;

public class Program80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string containing HTML tags: ");
        String input = sc.nextLine();

        // Removing HTML tags using regex
        String result = input.replaceAll("<[^>]*>", "");

        // Displaying result
        System.out.println("Original String: " + input);
        System.out.println("String after removing HTML tags: " + result);

        sc.close();
    }
}
