import java.io.*;

class Program260 {
    public static void main(String[] args) {
        try {
            // Create InputStreamReader object to read input from keyboard
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);

            System.out.print("Enter a character: ");
            
            // Read a single character from user input
            char ch = (char) br.read();

            System.out.println("You entered: " + ch);

            // Close the reader
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
