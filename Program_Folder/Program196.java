import java.util.Scanner;

public class Program196 {

    // Custom Exception for No Vowel Found
    static class NoVowelException extends Exception {
        public NoVowelException(String message) {
            super(message);
        }
    }

    // Method to check for vowels in a string
    static void checkVowels(String input) throws NoVowelException {
        String vowels = "aeiouAEIOU";
        boolean hasVowel = false;

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
                break;
            }
        }

        if (!hasVowel) {
            throw new NoVowelException("The string does not contain any vowels.");
        } else {
            System.out.println("✅ The string contains vowels.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            checkVowels(str);
        } 
        catch (NoVowelException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }
    }
}
