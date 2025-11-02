// Program402.java
// Program to add characters to a string using StringBuffer class

import java.util.Scanner;

public class Program402 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the initial string
        System.out.print("Enter the original string: ");
        String str = sc.nextLine();

        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer(str);

        // Input character(s) to add
        System.out.print("Enter character(s) to add: ");
        String charsToAdd = sc.nextLine();

        // Add characters to the end of the string
        sb.append(charsToAdd);

        // Display the result
        System.out.println("\nAfter adding characters:");
        System.out.println("Resulting String: " + sb.toString());

        sc.close();
    }
}
