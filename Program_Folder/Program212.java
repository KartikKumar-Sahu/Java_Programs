// Program212.java
public class Program212 {

    // Method to count number of digits in an integer
    public static int countDigits(int number) {
        if (number == 0)
            return 1;

        int count = 0;
        while (number > 0) {
            number /= 10;  // Remove the last digit
            count++;
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        int number = 2;  // Given value
        int digits = countDigits(number);

        System.out.println("The number of digits in " + number + " is: " + digits);
    }
}
