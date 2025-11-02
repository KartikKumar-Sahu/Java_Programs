// Program425.java
// Program to find the number of words in a given text file

import java.io.*;
import java.util.*;

public class Program425 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path of the text file: ");
        String filePath = sc.nextLine();

        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Remove punctuation and normalize spaces
                line = line.trim().replaceAll("[^a-zA-Z0-9\\s]", " ");
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+"); // split by one or more spaces
                    wordCount += words.length;
                }
            }

            System.out.println("\nTotal number of words in the file: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("\nError: File not found. Please check the path.");
        } catch (IOException e) {
            System.out.println("\nError reading file: " + e.getMessage());
        }

        sc.close();
    }
}
