import java.util.Scanner;

public class Program136 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Round up division result
        int result = (int) Math.ceil((double) dividend / divisor);

        System.out.println("Rounded up result: " + result);

        sc.close();
    }
}
