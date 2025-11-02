import java.util.Scanner;

public class Program144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float number as a string: ");
        String strNumber = sc.nextLine();

        // Converting String to float using Float.parseFloat()
        float number = Float.parseFloat(strNumber);

        System.out.println("Converted float value: " + number);

        sc.close();
    }
}
