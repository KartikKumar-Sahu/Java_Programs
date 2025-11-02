import java.util.Scanner;

class Program285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input elements for Matrix 1
        System.out.println("\nEnter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements for Matrix 2
        System.out.println("\nEnter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Check equality
        boolean equal = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    equal = false;
                    break; // Exit inner loop early
                }
            }
            if (!equal) break; // Exit outer loop early
        }

        // Display result
        if (equal)
            System.out.println("\n✅ The two matrices are equal.");
        else
            System.out.println("\n❌ The two matrices are NOT equal.");

        sc.close();
    }
}
