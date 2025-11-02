import java.util.Scanner;

class Program266 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a short integer
        System.out.print("Enter a short integer: ");
        short num = sc.nextShort(); // reads short integer input

        // Display the entered short value
        System.out.println("You entered: " + num);

        // Close the Scanner
        sc.close();
    }
}
