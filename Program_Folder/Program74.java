import java.util.Scanner;

public class Program74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Replacing all 'd' with 'f'
        String replacedString = input.replace('d', 'f');

        // Displaying result
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + replacedString);

        sc.close();
    }
}
