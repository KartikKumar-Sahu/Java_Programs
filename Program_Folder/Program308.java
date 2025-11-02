// Program308: Access java.util.Date without import (using qualified class name)

public class Program308 {
    public static void main(String[] args) {
        // Create an object of Date using fully qualified name
        java.util.Date currentDate = new java.util.Date();

        // Print the current system date and time
        System.out.println("Current System Date and Time: " + currentDate);
    }
}
