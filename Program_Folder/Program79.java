import java.util.Scanner;

public class Program79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reversing the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Displaying result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
