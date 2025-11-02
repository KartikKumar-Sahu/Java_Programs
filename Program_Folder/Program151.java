import java.util.Scanner;

public class Program151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Converting char to String using String.valueOf()
        String str = String.valueOf(ch);

        System.out.println("Converted String value: " + str);

        sc.close();
    }
}
