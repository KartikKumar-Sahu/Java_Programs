public class Program20 {
    public static void main(String[] args) {
        int count = 0;       // Counts the number of primes found
        int number = 2;      // Number to check for primality
        int sum = 0;         // Sum of prime numbers

        // Loop until we find the first 100 prime numbers
        while (count < 100) {
            if (isPrime(number)) {
                sum += number;   // Add prime number to sum
                count++;         // Increment prime count
            }
            number++;             // Check the next number
        }

        // Display the result
        System.out.println("The sum of the first 100 prime numbers is: " + sum);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Divisible by i, not prime
        }
        return true; // Number is prime
    }
}
