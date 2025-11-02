import java.util.*;
import java.util.concurrent.*;

class Program298 {

    // Check primality (fast enough for typical inputs)
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int limit = (int)Math.sqrt(n);
        for (int d = 3; d <= limit; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Compute sum of primes up to: ");
        int N = sc.nextInt();
        sc.close();

        if (N < 2) {
            System.out.println("Sum of primes up to " + N + " = 0");
            return;
        }

        int threads = Math.max(1, Runtime.getRuntime().availableProcessors());
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        List<Future<Long>> futures = new ArrayList<>();

        // Split [2..N] into ~equal chunks
        int total = N - 1; // numbers from 2 to N inclusive
        int chunk = (int)Math.ceil(total / (double)threads);

        for (int t = 0; t < threads; t++) {
            int start = 2 + t * chunk;
            int end = Math.min(N, start + chunk - 1);
            if (start > end) break; // in case N is small

            final int s = start, e = end;
            futures.add(pool.submit(() -> {
                long localSum = 0L;
                for (int x = s; x <= e; x++) {
                    if (isPrime(x)) localSum += x;
                }
                return localSum;
            }));
        }

        // Combine partial sums
        long sum = 0L;
        for (Future<Long> f : futures) {
            sum += f.get();
        }
        pool.shutdown();

        System.out.println("Threads used: " + threads);
        System.out.println("Sum of primes up to " + N + " = " + sum);
    }
}
