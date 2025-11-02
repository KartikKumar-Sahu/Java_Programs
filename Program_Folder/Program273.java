import java.util.*;

// Define the Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

// SavingsAccount class implementing Account
class SavingsAccount implements Account {
    private String accountNumber;
    private double balance;
    private double interestRate = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Savings Account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Savings Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Savings Account " + accountNumber);
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of ₹" + interest + " added to Savings Account " + accountNumber);
    }

    public void viewBalance() {
        System.out.println("Savings Account " + accountNumber + " balance: ₹" + balance);
    }

    // Unique method for SavingsAccount
    public void savingsInfo() {
        System.out.println("Savings Account - Interest Rate: " + (interestRate * 100) + "%");
    }
}

// CurrentAccount class implementing Account
class CurrentAccount implements Account {
    private String accountNumber;
    private double balance;
    private double overdraftLimit = 10000; // ₹10,000 overdraft limit

    public CurrentAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Current Account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Current Account " + accountNumber);
        } else {
            System.out.println("Overdraft limit exceeded in Current Account " + accountNumber);
        }
    }

    public void calculateInterest() {
        System.out.println("Current Accounts do not earn interest.");
    }

    public void viewBalance() {
        System.out.println("Current Account " + accountNumber + " balance: ₹" + balance);
    }

    // Unique method for CurrentAccount
    public void checkOverdraftLimit() {
        System.out.println("Overdraft limit: ₹" + overdraftLimit);
    }
}

// Bank class that manages accounts
class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account added to the bank successfully.");
    }

    public void showAllAccounts() {
        System.out.println("\n=== Bank Accounts Summary ===");
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}

// Main class
class Program273 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        SavingsAccount savings = new SavingsAccount("SAV123", 5000);
        CurrentAccount current = new CurrentAccount("CUR456", 2000);

        // Add accounts to bank
        bank.addAccount(savings);
        bank.addAccount(current);

        // Perform operations
        savings.deposit(1500);
        savings.calculateInterest();
        savings.withdraw(1000);
        savings.savingsInfo();

        current.deposit(3000);
        current.withdraw(4500);
        current.checkOverdraftLimit();

        // Display all balances
        bank.showAllAccounts();
    }
}
