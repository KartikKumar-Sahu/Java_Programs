import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Program297 {

    // Multiply A (r1 x c1) with B (r2 x c2) -> C (r1 x c2), using multiple threads
    private static int[][] multiply(int[][] A, int[][] B) throws InterruptedException {
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;

        if (c1 != r2) {
            throw new IllegalArgumentException("Matrix dimensions incompatible: c1 must equal r2.");
        }

        int[][] C = new int[r1][c2];

        // Use at most one thread per row, capped by available processors
        int maxThreads = Math.max(1, Math.min(r1, Runtime.getRuntime().availableProcessors()));
        ExecutorService pool = Executors.newFixedThreadPool(maxThreads);
        CountDownLatch latch = new CountDownLatch(r1);

        for (int row = 0; row < r1; row++) {
            final int r = row;
            pool.submit(() -> {
                for (int j = 0; j < c2; j++) {
                    int sum = 0;
                    for (int k = 0; k < c1; k++) {
                        sum += A[r][k] * B[k][j];
                    }
                    C[r][j] = sum;
                }
                latch.countDown();
            });
        }

        latch.await();
        pool.shutdown();
        return C;
    }

    private static void printMatrix(String title, int[][] M) {
        System.out.println(title);
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // Read Matrix A
        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols of Matrix A: ");
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("\nEnter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // Read Matrix B
        System.out.print("\nEnter rows of Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols of Matrix B: ");
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("\nEnter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        // Validate and multiply
        if (c1 != r2) {
            System.out.println("\nMatrix multiplication not possible! (cols of A must equal rows of B)");
            sc.close();
            return;
        }

        int[][] C = multiply(A, B);

        // Output
        System.out.println();
        printMatrix("Matrix A:", A);
        System.out.println();
        printMatrix("Matrix B:", B);
        System.out.println();
        printMatrix("Product (A x B):", C);

        sc.close();
    }
}
