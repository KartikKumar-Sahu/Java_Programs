import java.util.Scanner;

public class Program123 {

    // Method to count total vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // convert to lowercase for easy comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("Total number of vowels: " + vowelCount);

        sc.close();
    }
}
