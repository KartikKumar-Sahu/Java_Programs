import java.util.*;

public class Program195 {

    // Custom Exception for Duplicate Numbers
    static class DuplicateNumberException extends Exception {
        public DuplicateNumberException(String message) {
            super(message);
        }
    }

    // Method to read integers and check for duplicates
    static void readNumbers() throws DuplicateNumberException {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            // If number already exists in set, throw exception
            if (!numbers.add(num)) {
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
        }

        System.out.println("✅ All numbers are unique: " + numbers);
    }

    public static void main(String[] args) {
        try {
            readNumbers();
        } 
        catch (DuplicateNumberException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }
    }
}
