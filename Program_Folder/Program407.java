// Program407.java
// Program to convert a String to a String Array

import java.util.Scanner;

public class Program407 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Convert the String into a String array using split()
        String[] words = sentence.split(" "); // split by space

        // Display the String array
        System.out.println("\nConverted String Array:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + words[i]);
        }

        sc.close();
    }
}
