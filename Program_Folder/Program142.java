import java.util.Scanner;

public class Program142 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String strNumber = sc.nextLine();

        // Converting String to long using Long.parseLong()
        long number = Long.parseLong(strNumber);

        System.out.println("Converted long value: " + number);

        sc.close();
    }
}
