import java.util.Scanner;

public class Program105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Input marks for each subject
        System.out.println("Enter marks for " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        double percentage = (double) total / n;

        // Display results
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
