// Program306: Demonstration of join() and yield() methods

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);

            // Demonstrate yield(): voluntarily give up CPU time
            if (i == 3) {
                System.out.println(getName() + " yielding at count " + i);
                Thread.yield();  // hint to scheduler
            }

            try {
                Thread.sleep(500); // simulate some work
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " finished execution.");
    }
}

public class Program306 {
    public static void main(String[] args) {
        System.out.println("Main thread started...\n");

        // Create three threads
        MyThread t1 = new MyThread("Thread-A");
        MyThread t2 = new MyThread("Thread-B");
        MyThread t3 = new MyThread("Thread-C");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Demonstrate join(): main thread waits for t1 to complete
        try {
            System.out.println("\nMain thread waiting for Thread-A to finish using join()...\n");
            t1.join();  // main thread pauses here until Thread-A completes
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }

        System.out.println("\nThread-A has completed. Main thread continues execution.");

        // Wait for other threads to finish before exiting
        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nMain thread finished.");
    }
}
