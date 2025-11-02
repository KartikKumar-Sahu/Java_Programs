import java.io.*;

class Program269 {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;

        try {
            // Create a FileReader and BufferedReader for efficient reading
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read each line until end of file
            while ((line = br.readLine()) != null) {
                lines++; // Count line
                chars += line.length(); // Count characters (excluding newline)
                
                // Split line into words based on spaces
                String[] wordArray = line.trim().split("\\s+");
                if (line.trim().length() > 0) { // avoid counting empty lines
                    words += wordArray.length;
                }
            }

            // Close the file
            br.close();

            // Display results
            System.out.println("File Statistics:");
            System.out.println("Total Lines      : " + lines);
            System.out.println("Total Words      : " + words);
            System.out.println("Total Characters : " + chars);
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure 'input.txt' exists.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
