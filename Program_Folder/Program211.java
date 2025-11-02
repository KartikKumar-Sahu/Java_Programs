// Program211.java
public class Program211 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to print all twin primes less than 100
    public static void printTwinPrimes() {
        System.out.println("Twin prime numbers less than 100 are:");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        printTwinPrimes();
    }
}
