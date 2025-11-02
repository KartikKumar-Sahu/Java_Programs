public class Program130 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    // Method to display prime numbers between 1 and 20
    public static void displayPrimes() {
        System.out.println("Prime numbers between 1 and 20 are:");

        for (int i = 1; i <= 20; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        displayPrimes();
    }
}
