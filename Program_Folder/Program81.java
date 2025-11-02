import java.util.Scanner;

public class Program81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking multi-line input from the user
        System.out.println("Enter a text (use \\n for new lines, and press Enter when done):");
        String input = sc.useDelimiter("\\Z").next(); // Reads all input until EOF (end of input)

        // Counting lines
        String[] lines = input.split("\\r?\\n");
        int lineCount = lines.length;

        // Displaying result
        System.out.println("Total number of lines: " + lineCount);

        sc.close();
    }
}
