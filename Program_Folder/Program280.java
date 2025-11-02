import java.util.Arrays;

// Define the Sortable interface
interface Sortable {
    void sort(int[] array);
}

// QuickSort class implementing Sortable
class QuickSort implements Sortable {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        System.out.println("Array sorted using QuickSort (Descending): " + Arrays.toString(array));
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) { // '>' for descending order
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

// MergeSort class implementing Sortable
class MergeSort implements Sortable {

    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        System.out.println("Array sorted using MergeSort (Descending): " + Arrays.toString(array));
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge in descending order
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}

// Main class
class Program280 {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 1, 7, 3};
        int[] array2 = {8, 4, 10, 2, 6, 5};

        // Create Sortable objects
        Sortable quickSort = new QuickSort();
        Sortable mergeSort = new MergeSort();

        // Sort arrays using both algorithms
        quickSort.sort(array1);
        mergeSort.sort(array2);
    }
}
