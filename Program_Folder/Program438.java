// Program438.java
// Program to swap pair of characters in a string

import java.util.Scanner;

public class Program438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to character array for easy manipulation
        char[] ch = str.toCharArray();

        // Swap characters in pairs
        for (int i = 0; i < ch.length - 1; i += 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }

        // Convert back to string
        String swapped = new String(ch);

        // Display results
        System.out.println("\nOriginal String: " + str);
        System.out.println("After Swapping Pairs: " + swapped);

        sc.close();
    }
}
