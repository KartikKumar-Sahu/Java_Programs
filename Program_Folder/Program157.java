import java.util.Scanner;

public class Program157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double doubleNum = sc.nextDouble();

        // Converting double to int (narrowing conversion)
        int intNum = (int) doubleNum;  // Explicit casting required

        System.out.println("Converted integer value: " + intNum);

        sc.close();
    }
}
