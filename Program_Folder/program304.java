// Program304: Example of synchronization with multiple threads

class Printer {
    // synchronized method — only one thread can access this method at a time
    synchronized void printTable(int n) {
        System.out.println(Thread.currentThread().getName() + " is printing the multiplication table of " + n);
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500); // simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished printing.\n");
    }
}

class MyThread extends Thread {
    private final Printer printer;
    private final int number;

    MyThread(Printer p, int n, String name) {
        super(name);
        printer = p;
        number = n;
    }

    public void run() {
        printer.printTable(number);
    }
}

public class Program304 {
    public static void main(String[] args) {
        Printer printer = new Printer(); // shared resource

        // Creating multiple threads that share the same Printer object
        MyThread t1 = new MyThread(printer, 5, "Thread-A");
        MyThread t2 = new MyThread(printer, 10, "Thread-B");
        MyThread t3 = new MyThread(printer, 15, "Thread-C");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
