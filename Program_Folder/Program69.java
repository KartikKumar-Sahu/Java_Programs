import java.util.Scanner;

public class Program69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Concatenating the strings
        String result = str1 + str2;

        // Displaying result
        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}
