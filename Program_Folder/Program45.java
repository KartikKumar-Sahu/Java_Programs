import java.util.Scanner;

public class Program45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter total units consumed: ");
        double units = sc.nextDouble();

        double billAmount = 0;

        // Calculating bill based on unit slabs
        if (units <= 100) {
            billAmount = units * 1.5; // ₹1.5 per unit for first 100 units
        } else if (units <= 200) {
            billAmount = (100 * 1.5) + ((units - 100) * 2.5); // ₹2.5 for next 100
        } else if (units <= 300) {
            billAmount = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0); // ₹4 for next 100
        } else {
            billAmount = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + ((units - 300) * 5.0); // ₹5 for above 300
        }

        // Adding fixed charge
        double totalBill = billAmount + 50; // ₹50 fixed charge

        // Displaying result
        System.out.println("Electricity Bill Summary:");
        System.out.println("----------------------------");
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount (with fixed charge): ₹" + totalBill);

        sc.close();
    }
}
