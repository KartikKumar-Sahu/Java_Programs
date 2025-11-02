import java.util.*;

public class Program91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        String[] arr = new String[n];

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Converting array to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));

        // Displaying result
        System.out.println("ArrayList elements: " + arrayList);

        sc.close();
    }
}
