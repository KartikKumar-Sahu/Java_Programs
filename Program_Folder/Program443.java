// Program443.java
// Program to find the first non-repeated character from an input string

import java.util.*;

public class Program443 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces (optional)
        str = str.toLowerCase().replaceAll("\\s+", "");

        // LinkedHashMap preserves insertion order
        Map<Character, Integer> freq = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1
        char firstNonRepeated = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeated = entry.getKey();
                break;
            }
        }

        // Display result
        if (firstNonRepeated != 0) {
            System.out.println("\nThe first non-repeated character is: " + firstNonRepeated);
        } else {
            System.out.println("\nNo non-repeated characters found in the string.");
        }

        sc.close();
    }
}
