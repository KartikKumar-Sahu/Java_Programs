import java.io.*;

class Program260 {
    public static void main(String[] args) {
        try {
            // Create InputStreamReader object connected to System.in
            InputStreamReader reader = new InputStreamReader(System.in);

            // Wrap it with BufferedReader for efficient reading
            BufferedReader br = new BufferedReader(reader);

            // Prompt user to enter a string
            System.out.print("Enter a string: ");
            String input = br.readLine(); // readLine() reads a full line of text

            // Display the entered string
            System.out.println("You entered: " + input);

            // Close the BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
