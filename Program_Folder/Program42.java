import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        // Converting to lowercase for easier comparison
        ch = Character.toLowerCase(ch);

        // Checking if vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonant.");
        } 
        else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}
