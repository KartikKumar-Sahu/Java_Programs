// Program367.java
// Program to demonstrate encapsulation with a BankAccount class

class BankAccount {

    // Private instance variables
    private String accountNumber;
    private double balance;

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) { // validation
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class
public class Program367 {
    public static void main(String[] args) {

        // Create a BankAccount object
        BankAccount account1 = new BankAccount();

        // Set values using setter methods
        account1.setAccountNumber("BA123456789");
        account1.setBalance(1500.75);

        // Display details
        System.out.println("=== Bank Account Details ===");
        account1.displayAccountInfo();

        // Access individual fields using getters
        System.out.println("\nAccessing values individually:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: $" + account1.getBalance());

        // Try setting an invalid balance
        System.out.println("\nTrying to set negative balance...");
        account1.setBalance(-500); // validation check
    }
}
