// Program207.java
import java.util.Scanner;

public class Program207 {

    // Method to compute future investment value
    public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 1200;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = futureInvestmentValue(investmentAmount, annualInterestRate, years);

        System.out.printf("Future investment value is: %.2f", futureValue);

        sc.close();
    }
}
