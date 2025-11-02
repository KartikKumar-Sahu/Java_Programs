import java.io.*;

class Program268 {
    public static void main(String[] args) {
        try {
            // Create a FileReader to read from a file
            FileReader fr = new FileReader("input.txt"); // file name (must exist in the same directory)
            
            int ch; // variable to hold character data
            
            System.out.println("Contents of the file:");
            
            // Read characters one by one until end of file (-1)
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // display character
            }

            // Close the FileReader
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure 'input.txt' exists.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
