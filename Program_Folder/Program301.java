// Program301: Create multiple threads using Runnable interface

class MyTask implements Runnable {
    private final String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    // Code to be executed by each thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(500); // small delay to simulate work
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " completed.");
    }
}

public class Program301 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");

        // Create Runnable tasks
        Runnable task1 = new MyTask("Thread-A");
        Runnable task2 = new MyTask("Thread-B");
        Runnable task3 = new MyTask("Thread-C");

        // Create Thread objects for each Runnable
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

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
