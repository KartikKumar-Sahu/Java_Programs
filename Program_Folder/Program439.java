// Program439.java
// Program to check if the first string contains the second string

import java.util.Scanner;

public class Program439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Check if first string contains second string
        if (str1.contains(str2)) {
            System.out.println("\nResult: The first string contains the second string.");
        } else {
            System.out.println("\nResult: The first string does NOT contain the second string.");
        }

        sc.close();
    }
}
