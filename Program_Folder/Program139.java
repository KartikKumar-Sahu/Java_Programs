import java.util.Scanner;

public class Program139 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float num = sc.nextFloat();

        float roundedValue = Math.round(num);

        System.out.println("Rounded value: " + roundedValue);

        sc.close();
    }
}
