// Program347.java
import java.util.ArrayList;

public class Program347 {

    // --- Account class ---
    static class Account {
        private String accountNumber;
        private String accountHolder;
        private double balance;

        // Constructor
        public Account(String accountNumber, String accountHolder, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        // Getters
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        // Deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("💰 Deposited " + amount + " into account " + accountNumber);
            } else {
                System.out.println("⚠️ Deposit amount must be positive.");
            }
        }

        // Withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("💸 Withdrew " + amount + " from account " + accountNumber);
            } else if (amount > balance) {
                System.out.println("❌ Insufficient balance for withdrawal from account " + accountNumber);
            } else {
                System.out.println("⚠️ Withdrawal amount must be positive.");
            }
        }

        // Display account details
        public void displayAccountInfo() {
            System.out.println("Account No: " + accountNumber + 
                               ", Holder: " + accountHolder + 
                               ", Balance: " + balance);
        }
    }

    // --- Bank class ---
    static class Bank {
        private ArrayList<Account> accounts = new ArrayList<>();

        // Add new account
        public void addAccount(Account account) {
            accounts.add(account);
            System.out.println("✅ Added new account: " + account.getAccountNumber());
        }

        // Remove account by account number
        public void removeAccount(String accountNumber) {
            boolean removed = false;
            for (Account acc : accounts) {
                if (acc.getAccountNumber().equals(accountNumber)) {
                    accounts.remove(acc);
                    System.out.println("🗑️ Removed account: " + accountNumber);
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("⚠️ No account found with number: " + accountNumber);
            }
        }

        // Deposit money to an account
        public void deposit(String accountNumber, double amount) {
            Account acc = findAccount(accountNumber);
            if (acc != null) {
                acc.deposit(amount);
            } else {
                System.out.println("⚠️ Account not found: " + accountNumber);
            }
        }

        // Withdraw money from an account
        public void withdraw(String accountNumber, double amount) {
            Account acc = findAccount(accountNumber);
            if (acc != null) {
                acc.withdraw(amount);
            } else {
                System.out.println("⚠️ Account not found: " + accountNumber);
            }
        }

        // Find account by account number
        private Account findAccount(String accountNumber) {
            for (Account acc : accounts) {
                if (acc.getAccountNumber().equals(accountNumber)) {
                    return acc;
                }
            }
            return null;
        }

        // Display all accounts
        public void displayAllAccounts() {
            if (accounts.isEmpty()) {
                System.out.println("📭 No accounts in the bank.");
            } else {
                System.out.println("\n=== Bank Accounts ===");
                for (Account acc : accounts) {
                    acc.displayAccountInfo();
                }
            }
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        Account acc1 = new Account("A1001", "Alice Johnson", 5000.00);
        Account acc2 = new Account("A1002", "Bob Smith", 3000.00);

        // Add accounts
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Display all accounts
        bank.displayAllAccounts();

        // Perform transactions
        System.out.println("\n--- Performing Transactions ---");
        bank.deposit("A1001", 1500);
        bank.withdraw("A1002", 1000);
        bank.withdraw("A1002", 5000);  // Test insufficient funds

        // Display after transactions
        bank.displayAllAccounts();

        // Remove an account
        System.out.println("\n--- Removing Account ---");
        bank.removeAccount("A1001");

        // Final display
        bank.displayAllAccounts();
    }
}
