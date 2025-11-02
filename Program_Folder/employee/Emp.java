package employee;

import java.util.Scanner;

public class Emp {
    // Instance variables
    String name, category;
    int empid;
    double bpay, hra, da, allowance, pf, grosspay, incometax, npay;

    // Method to input employee details
    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Category: ");
        category = sc.nextLine();

        System.out.print("Enter Basic Pay (bpay): ");
        bpay = sc.nextDouble();
    }

    // Method to calculate payroll components
    public void calculate() {
        // Allowances based on category (example logic)
        if (category.equalsIgnoreCase("A"))
            allowance = 2000;
        else if (category.equalsIgnoreCase("B"))
            allowance = 1500;
        else
            allowance = 1000;

        hra = 0.20 * bpay;      // 20% of basic pay
        da = 0.10 * bpay;       // 10% of basic pay
        pf = 0.12 * bpay;       // 12% provident fund
        grosspay = bpay + hra + da + allowance;
        incometax = 0.10 * grosspay; // 10% income tax
        npay = grosspay - (pf + incometax);
    }

    // Method to display payroll details
    public void display() {
        System.out.println("\n----- Employee Payroll Details -----");
        System.out.println("Employee ID   : " + empid);
        System.out.println("Employee Name : " + name);
        System.out.println("Category      : " + category);
        System.out.println("Basic Pay     : " + bpay);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Allowance     : " + allowance);
        System.out.println("PF            : " + pf);
        System.out.println("Gross Pay     : " + grosspay);
        System.out.println("Income Tax    : " + incometax);
        System.out.println("Net Pay       : " + npay);
        System.out.println("------------------------------------");
    }
}
