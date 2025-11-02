// Program406.java
// Program to convert Enum to String in Java

public class Program406 {

    // Define an Enum for demonstration
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        // Create an Enum variable
        Day today = Day.WEDNESDAY;

        // Method 1: Using name() method
        String str1 = today.name();

        // Method 2: Using toString() method
        String str2 = today.toString();

        // Method 3: Using String concatenation
        String str3 = "" + today;

        // Display the results
        System.out.println("=== Converting Enum to String ===");
        System.out.println("Using name():      " + str1);
        System.out.println("Using toString():  " + str2);
        System.out.println("Using concatenation: " + str3);
    }
}
