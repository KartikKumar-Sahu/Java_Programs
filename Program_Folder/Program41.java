import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        double total = 0;

        // Taking marks input
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();
            total += marks;
        }

        // Calculating average
        double average = total / subjects;

        // Displaying result
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
