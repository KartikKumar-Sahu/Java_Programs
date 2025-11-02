import java.util.Scanner;

class Program260 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a double value
        System.out.print("Enter a double number: ");
        double num = sc.nextDouble(); // reads double input

        // Display the entered double value
        System.out.println("You entered: " + num);

        // Close the Scanner
        sc.close();
    }
}
