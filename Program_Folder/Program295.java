// Program295: Two threads to print even and odd numbers from 1 to 20

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
            try {
                Thread.sleep(100); // small delay for readability
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
            try {
                Thread.sleep(100); // small delay for readability
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Program295 {
    public static void main(String[] args) {
        // Create thread objects
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}
