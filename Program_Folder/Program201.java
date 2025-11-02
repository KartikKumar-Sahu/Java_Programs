// Program201.java
public class Program201 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0;  // This line causes two potential exceptions
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: Division by zero not allowed.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught: Invalid array index.");
        } 
        catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
