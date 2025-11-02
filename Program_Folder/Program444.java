// Program444.java
// Program to create an object of StringBuffer class to reverse a string

import java.util.Scanner;

public class Program444 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Create a StringBuffer object with the input string
        StringBuffer sb = new StringBuffer(str);

        // Reverse the string using reverse() method
        String reversed = sb.reverse().toString();

        // Display results
        System.out.println("\nOriginal String: " + str);
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
