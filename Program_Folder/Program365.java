// Program365.java
// Program to accept and display command-line arguments

class Program365 {

    public static void main(String[] args) {

        // Check if any arguments are passed
        if (args.length == 0) {
            System.out.println("No command-line arguments entered!");
            System.out.println("Usage Example: java Program365 Hello World 123");
        } else {
            System.out.println("=== Command Line Arguments ===");

            // Display all arguments
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
