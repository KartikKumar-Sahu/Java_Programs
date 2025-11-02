import java.util.Scanner;

class Program260 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a float value
        System.out.print("Enter a float number: ");
        float num = sc.nextFloat(); // reads float input

        // Display the entered float
        System.out.println("You entered: " + num);

        // Close the Scanner
        sc.close();
    }
}
