import java.util.Scanner;

class Program265 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = sc.nextBoolean(); // reads boolean input

        // Display the entered boolean
        System.out.println("You entered: " + value);

        // Close the Scanner
        sc.close();
    }
}
