import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of subjects as input
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double totalGradePoints = 0;

        // Taking grade points for each subject
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = sc.nextDouble();
            totalGradePoints += gradePoint;
        }

        // Calculating CGPA
        double cgpa = totalGradePoints / n;

        // Converting CGPA to Percentage
        double percentage = cgpa * 9.5;

        // Displaying results
        System.out.println("\n----- Result -----");
        System.out.println("CGPA: " + cgpa);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
