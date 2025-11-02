import java.util.Scanner;

public class Program161 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Converting boolean to String
        String str = String.valueOf(bool);

        System.out.println("The String value is: " + str);

        sc.close();
    }
}
