import java.util.Scanner;

class Program267 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a long integer
        System.out.print("Enter a long integer: ");
        long num = sc.nextLong(); // reads long integer input

        // Display the entered long value
        System.out.println("You entered: " + num);

        // Close the Scanner
        sc.close();
    }
}
