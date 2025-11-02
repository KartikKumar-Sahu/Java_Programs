public class Program190 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // Catch block handles the exception
            System.out.println("⚠️ Exception caught: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling...");
    }
}
