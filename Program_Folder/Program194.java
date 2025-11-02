import java.io.*;

public class Program194 {

    // Custom exception for empty file
    static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }

    // Method to check if file is empty
    static void readFile(String fileName) throws IOException, EmptyFileException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        if (file.length() == 0) {
            throw new EmptyFileException("The file is empty: " + fileName);
        }

        // Read and display file content
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        System.out.println("File Content:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) {
        try {
            // Make sure you have a file named "data.txt" in the same directory
            readFile("data.txt");
        } 
        catch (FileNotFoundException e) {
            System.out.println("⚠️ " + e.getMessage());
        } 
        catch (EmptyFileException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("⚠️ I/O Error: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
