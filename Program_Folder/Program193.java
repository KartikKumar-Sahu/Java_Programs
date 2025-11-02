import java.io.*;
import java.util.*;

public class Program193 {

    // Custom Exception for positive numbers
    static class PositiveNumberException extends Exception {
        public PositiveNumberException(String message) {
            super(message);
        }
    }

    // Method to read numbers from file and check for positive numbers
    static void readNumbers(String fileName) throws IOException, PositiveNumberException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > 0) {
                sc.close();
                throw new PositiveNumberException("Positive number found: " + num);
            }
        }
        sc.close();
        System.out.println("All numbers are non-positive (zero or negative).");
    }

    public static void main(String[] args) {
        try {
            // Make sure the file "numbers.txt" exists with integers inside (space or newline separated)
            readNumbers("numbers.txt");
        } 
        catch (FileNotFoundException e) {
            System.out.println("⚠️ File not found: " + e.getMessage());
        } 
        catch (PositiveNumberException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("⚠️ I/O error occurred: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}
