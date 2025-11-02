// Program303: Create multiple threads, set their name and priority

class MyThread extends Thread {

    public MyThread(String name) {
        super(name); // set thread name via superclass constructor
    }

    // Code to be executed by each thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " [Priority: " + Thread.currentThread().getPriority() + "] - Count: " + i);
            try {
                Thread.sleep(500); // simulate work
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " completed execution.");
    }
}

public class Program303 {
    public static void main(String[] args) {
        System.out.println("Main thread started...\n");

        // Create threads
        MyThread t1 = new MyThread("Thread-A");
        MyThread t2 = new MyThread("Thread-B");
        MyThread t3 = new MyThread("Thread-C");

        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nMain thread finished.");
    }
}
