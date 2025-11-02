import java.util.Scanner;

class Program283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter number of rows for Matrix 1: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 1: ");
        int cols1 = sc.nextInt();

        // Input dimensions for second matrix
        System.out.print("Enter number of rows for Matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 2: ");
        int cols2 = sc.nextInt();

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("\nMatrix multiplication not possible!");
            System.out.println("Number of columns in Matrix 1 must equal number of rows in Matrix 2.");
            sc.close();
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] product = new int[rows1][cols2];

        // Input elements of Matrix 1
        System.out.println("\nEnter elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements of Matrix 2
        System.out.println("\nEnter elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Multiply the matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the product matrix
        System.out.println("\nProduct of the two matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
