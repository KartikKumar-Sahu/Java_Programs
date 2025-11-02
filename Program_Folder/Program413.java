// Program413.java
// Program to determine whether one string is a rotation of another

import java.util.Scanner;

public class Program413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Case-sensitive rotation check (default)
        boolean isRotation = isRotation(s1, s2);

        if (isRotation) {
            System.out.println("\n\"" + s2 + "\" is a rotation of \"" + s1 + "\"");
        } else {
            System.out.println("\n\"" + s2 + "\" is NOT a rotation of \"" + s1 + "\"");
        }

        sc.close();
    }

    // Checks if s2 is a rotation of s1
    private static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        if (s1.isEmpty()) return true; // both empty strings

        String doubled = s1 + s1;
        return doubled.contains(s2);
    }
}
