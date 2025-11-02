// Program302: Creating multiple threads using the Thread class

class MyThread extends Thread {
    private final String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    // The code that runs inside the thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // small delay for readability
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished execution.");
    }
}

public class Program302 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");

        // Create multiple threads
        MyThread t1 = new MyThread("Thread-A");
        MyThread t2 = new MyThread("Thread-B");
        MyThread t3 = new MyThread("Thread-C");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished.");
    }
}
