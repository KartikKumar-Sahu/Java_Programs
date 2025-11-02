import java.util.Arrays;
import java.util.Scanner;

class Program296 {

    // Merge two sorted ranges: arr[l..m-1] and arr[m..r-1] into a single sorted range
    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(arr, l, left, 0, n1);
        System.arraycopy(arr, m, right, 0, n2);

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Split point
        int mid = n / 2;

        // Thread 1: sort first half [0, mid)
        Thread t1 = new Thread(() -> Arrays.sort(arr, 0, mid));

        // Thread 2: sort second half [mid, n)
        Thread t2 = new Thread(() -> Arrays.sort(arr, mid, n));

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both to finish
        t1.join();
        t2.join();

        // Merge the two sorted halves
        merge(arr, 0, mid, n);

        // Output
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
