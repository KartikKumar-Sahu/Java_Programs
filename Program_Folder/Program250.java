// Program250.java

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract methods
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    // Common method
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Savings Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance! Minimum ₹" + MIN_BALANCE + " must be maintained.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 5000.0;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Current Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
}

public class Program250 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SAV12345", 5000);
        CurrentAccount ca = new CurrentAccount("CUR67890", 2000);

        System.out.println("--- Savings Account Operations ---");
        sa.displayBalance();
        sa.deposit(2000);
        sa.withdraw(5500);
        sa.displayBalance();

        System.out.println("\n--- Current Account Operations ---");
        ca.displayBalance();
        ca.deposit(3000);
        ca.withdraw(6000);
        ca.displayBalance();
    }
}
