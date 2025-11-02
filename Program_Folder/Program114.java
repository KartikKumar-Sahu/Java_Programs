import java.util.Scanner;

public class Program114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0)
                positiveCount++;
            else if (num < 0)
                negativeCount++;
            else
                zeroCount++;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nCount of Positive numbers: " + positiveCount);
        System.out.println("Count of Negative numbers: " + negativeCount);
        System.out.println("Count of Zeros: " + zeroCount);

        sc.close();
    }
}
