public class Program191 {

    // Method that throws an exception if number is odd
    static void checkEvenNumber(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is odd! Please enter an even number.");
        } else {
            System.out.println(num + " is an even number.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEvenNumber(5);  // This will throw an exception
        } 
        catch (Exception e) {
            System.out.println("⚠️ Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
