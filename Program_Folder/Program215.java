// Program215.java
import java.util.Scanner;

public class Program215 {

    // Method to check if all characters in a string are vowels
    public static boolean allVowels(String str) {
        str = str.toLowerCase(); // Convert to lowercase for comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) == -1) { // If not a vowel
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = allVowels(input);

        System.out.println("All characters are vowels? " + result);

        sc.close();
    }
}
