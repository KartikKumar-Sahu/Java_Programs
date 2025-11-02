import java.util.Scanner;

public class Program158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Converting char to int (gives ASCII value)
        int asciiValue = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        sc.close();
    }
}
