import java.util.Scanner;

public class Program115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, largest, smallest;
        char choice;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        largest = smallest = num; // initialize both with first input

        do {
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                System.out.print("Enter a number: ");
                num = sc.nextInt();

                if (num > largest)
                    largest = num;
                if (num < smallest)
                    smallest = num;
            }
        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nLargest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);

        sc.close();
    }
}
