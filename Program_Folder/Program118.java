import java.util.Scanner;

public class Program118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, first = 0, second = 1, next;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
