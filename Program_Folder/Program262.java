import java.util.Scanner;

class Program260 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int num = sc.nextInt(); // reads integer input

        // Display the entered integer
        System.out.println("You entered: " + num);

        // Close the Scanner
        sc.close();
    }
}
