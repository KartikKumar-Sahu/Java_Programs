import java.util.Scanner;

public class Program154 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Converting int to long (automatic widening conversion)
        long longNum = num;

        System.out.println("Converted long value: " + longNum);

        sc.close();
    }
}
