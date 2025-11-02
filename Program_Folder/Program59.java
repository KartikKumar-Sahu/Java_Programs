import java.util.Scanner;

public class Program59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking a character as input
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        // Converting to lowercase to handle both cases
        ch = Character.toLowerCase(ch);

        // Checking if it's a letter
        if (ch < 'a' || ch > 'z') {
            System.out.println("Invalid input! Please enter an alphabet.");
        } 
        // Checking vowel or consonant
        else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        sc.close();
    }
}
