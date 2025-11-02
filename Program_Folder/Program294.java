// Creating a basic thread that prints "Hello, World!"

class HelloThread extends Thread {
    public void run() {
        // Code executed by the thread
        System.out.println("Hello, World!");
    }
}

class Program294 {
    public static void main(String[] args) {
        // Create an instance of the thread
        HelloThread thread = new HelloThread();

        // Start the thread (calls run() method internally)
        thread.start();
    }
}
