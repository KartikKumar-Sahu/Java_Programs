// Program238.java
class BankAccount {
    protected double balance;

    // Constructor to initialize account balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding withdraw() method
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot fall below ₹100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

// Main class
public class Program238 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);
        account.withdraw(550); // Allowed
        account.withdraw(100); // Denied
    }
}
