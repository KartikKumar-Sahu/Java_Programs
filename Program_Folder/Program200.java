// Program200.java
public class Program200 {

    // This method declares that it may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // calling method that may throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}

