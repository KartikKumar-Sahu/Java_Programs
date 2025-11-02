import java.util.Scanner;

public class Program156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intNum = sc.nextInt();

        // Converting int to double (automatic widening conversion)
        double doubleNum = intNum;

        System.out.println("Converted double value: " + doubleNum);

        sc.close();
    }
}

