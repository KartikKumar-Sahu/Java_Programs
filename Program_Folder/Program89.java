import java.util.Scanner;

public class Program89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking first array input
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Taking second array input
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Common elements between the two arrays:");

        boolean found = false;
        // Finding common elements
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No common elements found.");
        }

        sc.close();
    }
}
