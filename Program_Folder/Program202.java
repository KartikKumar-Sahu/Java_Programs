// Program202.java
public class Program202 {
    public static void main(String[] args) {
        try {
            // Outer try block
            int a = 10;
            int b = 0;
            System.out.println("Outer try block starts...");

            try {
                // Inner try block
                int[] numbers = {1, 2, 3};
                System.out.println("Inner try block: Accessing invalid index...");
                System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds!");
            }

            System.out.println("Now dividing by zero...");
            int result = a / b; // This will throw ArithmeticException

        } 
        catch (ArithmeticException e) {
            System.out.println("Outer catch: Division by zero error!");
        }

        System.out.println("Program continues after exception handling...");
    }
}
