// Program398.java
// Program to prove that String is immutable programmatically

public class Program398 {
    public static void main(String[] args) {

        // Create a string
        String str1 = "Hello";

        // Print original string
        System.out.println("Original String: " + str1);

        // Modify the string (concatenation)
        String str2 = str1.concat(" World");

        // Print both strings
        System.out.println("After concatenation:");
        System.out.println("str1 (Original): " + str1);
        System.out.println("str2 (New): " + str2);

        // Compare memory references
        if (str1 == str2) {
            System.out.println("\nBoth refer to the same object (Mutable)");
        } else {
            System.out.println("\nBoth refer to different objects (Immutable)");
        }
    }
}
