import java.util.Scanner;

class Program291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the square matrix
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

        // Display the matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Check if the matrix is an identity matrix
        boolean isIdentity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) { // diagonal element should be 1
                    isIdentity = false;
                    break;
                } else if (i != j && matrix[i][j] != 0) { // non-diagonal should be 0
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) break;
        }

        // Display result
        if (isIdentity)
            System.out.println("\n✅ The given matrix is an Identity Matrix.");
        else
            System.out.println("\n❌ The given matrix is NOT an Identity Matrix.");

        sc.close();
    }
}
