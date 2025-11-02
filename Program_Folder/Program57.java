import java.util.Scanner;

public class Program57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        // Taking 5 numbers as input
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            double num = sc.nextDouble();
            sum += num;
        }

        // Calculating average
        double average = sum / 5;

        // Displaying results
        System.out.println("\n----- Sum and Average -----");
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}
