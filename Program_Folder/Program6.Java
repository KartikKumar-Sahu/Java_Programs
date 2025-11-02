public class Program6 {
    public static void main(String[] args) {
        // Declare two variables
        int num1 = 10;
        int num2 = 20;

        // Display values before swapping
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swap the values of num1 and num2
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display values after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
