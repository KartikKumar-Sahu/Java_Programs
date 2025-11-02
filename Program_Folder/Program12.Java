import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Initialize counters for letters, spaces, numbers, and other characters
        int letterCount = 0, spaceCount = 0, numberCount = 0, otherCount = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                letterCount++;
            }
            // Check if the character is a space
            else if (Character.isSpaceChar(ch)) {
                spaceCount++;
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                numberCount++;
            }
            // Otherwise, it's another character
            else {
                otherCount++;
            }
        }
        
        // Display the counts
        System.out.println("Letters: " + letterCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Other characters: " + otherCount);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
