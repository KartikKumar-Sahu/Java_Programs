import java.io.*;

public class Program9 {
    public static void main(String[] args) {
        try {
            // Execute the command to check the Java version
            Process process = Runtime.getRuntime().exec("java -version");
            
            // Get the error stream (Java version information is usually printed here)
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line;
            
            System.out.println("Checking if Java is installed...");
            
            // Read the output and display it
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Check if the Java command was executed successfully
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.out.println("Java is not installed or the 'java' command is not available.");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("An error occurred while checking if Java is installed.");
            e.printStackTrace();
        }
    }
}
