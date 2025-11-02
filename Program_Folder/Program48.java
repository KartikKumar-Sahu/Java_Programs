import java.util.Scanner;

public class Program48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();

        System.out.print("Enter number of times player got out: ");
        int outs = sc.nextInt();

        // Check to avoid division by zero
        if (outs == 0) {
            System.out.println("Batting Average cannot be calculated (player never got out).");
        } else {
            double battingAverage = (double) runs / outs;

            // Display result
            System.out.println("\n----- Batting Average Calculation -----");
            System.out.println("Total Runs Scored: " + runs);
            System.out.println("Times Out: " + outs);
            System.out.println("Batting Average: " + battingAverage);
        }

        sc.close();
    }
}
