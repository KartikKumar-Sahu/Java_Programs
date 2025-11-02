import java.util.Scanner;

public class Program155 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a long value: ");
        long longNum = sc.nextLong();

        // Converting long to int (explicit narrowing conversion)
        int intNum = (int) longNum;

        System.out.println("Converted int value: " + intNum);

        sc.close();
    }
}
