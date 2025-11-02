import java.util.Scanner;

public class Program113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = 1;

        // Find the smaller number
        int min = (num1 < num2) ? num1 : num2;

        // Loop to find HCF
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        // Display result
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        sc.close();
    }
}
