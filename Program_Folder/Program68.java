import java.util.Scanner;

public class Program68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Displaying options
        System.out.println("----- Simple Calculator -----");
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        // Performing calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        sc.close();
    }
}
