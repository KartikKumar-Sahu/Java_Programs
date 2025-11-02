import java.util.Scanner;

public class Program140 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String strNumber = sc.nextLine();

        // Converting String to int using Integer.parseInt()
        int number = Integer.parseInt(strNumber);

        System.out.println("Converted integer value: " + number);

        sc.close();
    }
}
