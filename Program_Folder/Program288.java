import java.util.Scanner;

class Program288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("\nEnter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Initialize counters
        int evenCount = 0, oddCount = 0;

        // Count odd and even numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
        }

        // Display the matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Display frequency results
        System.out.println("\nFrequency of Even Numbers: " + evenCount);
        System.out.println("Frequency of Odd Numbers: " + oddCount);

        sc.close();
    }
}
