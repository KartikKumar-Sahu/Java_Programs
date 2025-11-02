import java.util.Scanner;

public class Program47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of interest (R) per annum: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time period in years (T): ");
        double time = sc.nextDouble();

        System.out.print("Enter number of times interest applied per year (n): ");
        double n = sc.nextDouble();

        // Compound Interest formula
        double amount = principal * Math.pow((1 + rate / (n * 100)), n * time);
        double compoundInterest = amount - principal;

        // Display results
        System.out.println("\n----- Compound Interest Calculation -----");
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + amount);

        sc.close();
    }
}
