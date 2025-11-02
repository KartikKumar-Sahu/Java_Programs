// Program300: Concurrent Bank Account Example

class BankAccount {
    private int balance;

    // Constructor
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
        notify(); // wake up waiting threads (if any)
    }

    // Synchronized withdraw method
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw: " + amount);
        while (balance < amount) {
            System.out.println("Insufficient funds for " + Thread.currentThread().getName() + ", waiting...");
            try {
                wait(); // wait for deposit
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private final BankAccount account;
    private final int amount;

    public DepositThread(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 3; i++) { // deposit multiple times
            account.deposit(amount);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WithdrawThread extends Thread {
    private final BankAccount account;
    private final int amount;

    public WithdrawThread(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 3; i++) { // withdraw multiple times
            account.withdraw(amount);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Program300 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // initial balance

        DepositThread depositor = new DepositThread(account, 500, "Depositor");
        WithdrawThread withdrawer1 = new WithdrawThread(account, 700, "Withdrawer-1");
        WithdrawThread withdrawer2 = new WithdrawThread(account, 900, "Withdrawer-2");

        // Start threads
        depositor.start();
        withdrawer1.start();
        withdrawer2.start();

        try {
            depositor.join();
            withdrawer1.join();
            withdrawer2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nFinal Account Balance: " + account.getBalance());
    }
}
