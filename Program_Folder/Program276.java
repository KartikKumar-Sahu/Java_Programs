import java.util.Arrays;

// Define the Sortable interface
interface Sortable {
    void sort(int[] arr);
}

// BubbleSort class implementing Sortable
class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort: " + Arrays.toString(arr));
    }
}

// SelectionSort class implementing Sortable
class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array sorted using Selection Sort: " + Arrays.toString(arr));
    }
}

// Main class
class Program276 {
    public static void main(String[] args) {
        int[] numbers1 = {5, 2, 9, 1, 5, 6};
        int[] numbers2 = {5, 2, 9, 1, 5, 6};

        // Create Sortable objects
        Sortable bubbleSort = new BubbleSort();
        Sortable selectionSort = new SelectionSort();

        // Sort using Bubble Sort
        bubbleSort.sort(numbers1);

        // Sort using Selection Sort
        selectionSort.sort(numbers2);
    }
}
