import java.util.LinkedList;
import java.util.Queue;

class Program305 {

    // A bounded, synchronized task queue demonstrating wait/notify/notifyAll
    static class TaskQueue {
        private final Queue<String> q = new LinkedList<>();
        private final int capacity;
        private boolean closed = false;

        TaskQueue(int capacity) { this.capacity = capacity; }

        // Producer puts an item; uses notify or notifyAll based on flag
        public synchronized void put(String item, boolean useNotifyAll) throws InterruptedException {
            while (q.size() == capacity && !closed) {
                wait(); // queue full -> producer waits
            }
            if (closed) return;
            q.add(item);
            System.out.printf("[%s] put: %s (size=%d)%n",
                    Thread.currentThread().getName(), item, q.size());

            // "Resume" waiting consumers:
            if (useNotifyAll) {
                notifyAll(); // resume ALL waiting threads
            } else {
                notify();    // resume ONE waiting thread
            }
        }

        // Consumer takes an item; waits if empty
        public synchronized String take() throws InterruptedException {
            while (q.isEmpty() && !closed) {
                System.out.printf("[%s] waiting (queue empty)%n", Thread.currentThread().getName());
                wait(); // consumer waits -> later "resumed" by notify/notifyAll
            }
            if (q.isEmpty() && closed) return null; // no more items
            String item = q.remove();
            notify(); // free space -> wake one producer (optional)
            return item;
        }

        // Close the queue and wake everyone so they can exit
        public synchronized void close() {
            closed = true;
            notifyAll(); // resume all waiters so they can see 'closed' and stop
        }
    }

    // Producer that optionally uses notifyAll on its last item
    static class Producer implements Runnable {
        private final TaskQueue queue;
        private final String name;
        private final int count;
        private final boolean notifyAllOnLast;

        Producer(TaskQueue queue, String name, int count, boolean notifyAllOnLast) {
            this.queue = queue; this.name = name; this.count = count; this.notifyAllOnLast = notifyAllOnLast;
        }

        @Override public void run() {
            Thread.currentThread().setName(name);
            try {
                for (int i = 1; i <= count; i++) {
                    boolean useNotifyAll = notifyAllOnLast && (i == count);
                    queue.put(name + "-task-" + i, useNotifyAll);
                    Thread.sleep(200); // simulate work
                }
            } catch (InterruptedException ignored) {}
        }
    }

    // Consumer that takes until queue closes
    static class Consumer implements Runnable {
        private final TaskQueue queue;
        private final String name;

        Consumer(TaskQueue queue, String name) { this.queue = queue; this.name = name; }

        @Override public void run() {
            Thread.currentThread().setName(name);
            try {
                while (true) {
                    String task = queue.take(); // may wait() here
                    if (task == null) break;    // queue closed and empty
                    System.out.printf("[%s] processing %s%n", name, task);
                    Thread.sleep(300); // simulate processing
                }
                System.out.printf("[%s] exiting%n", name);
            } catch (InterruptedException ignored) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Demo: wait / notify / notifyAll / sleep (resume via notify/notifyAll)");
        TaskQueue queue = new TaskQueue(3);

        // Start multiple consumers
        Thread c1 = new Thread(new Consumer(queue, "Consumer-1"));
        Thread c2 = new Thread(new Consumer(queue, "Consumer-2"));
        Thread c3 = new Thread(new Consumer(queue, "Consumer-3"));
        c1.start(); c2.start(); c3.start();

        // Start two producers:
        // - p1 uses notify() (wakes ONE waiter each put)
        // - p2 uses notifyAll() on its LAST item to "resume" everyone at once
        Thread p1 = new Thread(new Producer(queue, "Producer-A", 5, false));
        Thread p2 = new Thread(new Producer(queue, "Producer-B", 5, true));
        p1.start(); p2.start();

        // Let them run; sleep is just to stagger timing
        p1.join(); p2.join();

        // Close queue; notifyAll to wake any remaining waiters so they can exit
        queue.close();

        c1.join(); c2.join(); c3.join();
        System.out.println("Done.");
    }
}
