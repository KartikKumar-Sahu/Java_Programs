import java.util.Scanner;

class Program286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the square matrix
        System.out.print("Enter the number of rows and columns (square matrix): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("\nEnter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display lower triangular matrix
        System.out.println("\nLower Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    System.out.print(matrix[i][j] + "\t");
                else
                    System.out.print("0\t");  // upper elements replaced by 0
            }
            System.out.println();
        }

        sc.close();
    }
}
