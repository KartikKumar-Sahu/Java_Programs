import java.util.Scanner;

class Program284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] difference = new int[rows][cols];

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

        // Subtract matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("\nDifference of the two matrices (Matrix1 - Matrix2):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(difference[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
