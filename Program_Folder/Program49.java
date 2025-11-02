import java.util.Scanner;

public class Program49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter total sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter commission earned: ");
        double commission = sc.nextDouble();

        // Calculating commission percentage
        double commissionPercentage = (commission / sales) * 100;

        // Display result
        System.out.println("\n----- Commission Percentage Calculation -----");
        System.out.println("Total Sales: " + sales);
        System.out.println("Commission Earned: " + commission);
        System.out.println("Commission Percentage: " + commissionPercentage + "%");

        sc.close();
    }
}
