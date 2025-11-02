import java.util.Scanner;

public class Program119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of the series 1 + 2 + 3 + ... + " + n + " = " + sum);
        sc.close();
    }
}
