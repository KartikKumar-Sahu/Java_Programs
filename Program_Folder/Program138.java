import java.util.Scanner;

public class Program138 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float num = sc.nextFloat();

        float absoluteValue = Math.abs(num);

        System.out.println("Absolute value: " + absoluteValue);

        sc.close();
    }
}
