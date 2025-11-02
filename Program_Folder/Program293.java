import java.util.Scanner;

class Program293 {
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

        // Count zeros
        int zeroCount = 0;
        int totalElements = rows * cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0)
                    zeroCount++;
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

        // Check if sparse
        System.out.println("\nTotal elements: " + totalElements);
        System.out.println("Number of zero elements: " + zeroCount);

        if (zeroCount > (totalElements / 2))
            System.out.println("\n✅ The given matrix is a Sparse Matrix.");
        else
            System.out.println("\n❌ The given matrix is NOT a Sparse Matrix.");

        sc.close();
    }
}
