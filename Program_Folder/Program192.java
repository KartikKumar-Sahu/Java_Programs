import java.io.*;

public class Program192 {

    // Method to read a file and throw exception if not found
    static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file); // May throw FileNotFoundException
        System.out.println("File found: " + fileName);
    }

    public static void main(String[] args) {
        try {
            // Try to read a file that may not exist
            readFile("nonexistent.txt");
        } 
        catch (FileNotFoundException e) {
            System.out.println("⚠️ Exception caught: File not found - " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception...");
    }
}
