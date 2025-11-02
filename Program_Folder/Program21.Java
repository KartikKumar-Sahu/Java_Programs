import java.util.Arrays;

public class Program21 {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {10, 20, 30, 40, 50};

        // Create a new array to hold the swapped elements
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length);

        // Swap the first and last elements
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Display the new array with swapped elements
        System.out.println("New array after swapping first and last elements: " + Arrays.toString(newArray));
    }
}
