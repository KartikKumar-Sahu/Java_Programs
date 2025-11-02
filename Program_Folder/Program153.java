import java.util.Scanner;

public class Program153 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (will be stored as Object): ");
        Object obj = sc.nextLine();

        // Converting Object to String using toString()
        String str = obj.toString();

        System.out.println("Converted String: " + str);
        System.out.println("String Class Type: " + str.getClass().getName());

        sc.close();
    }
}
