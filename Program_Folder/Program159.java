import java.util.Scanner;

public class Program159 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (ASCII value): ");
        int num = sc.nextInt();

        // Converting int to char
        char ch = (char) num;

        System.out.println("The character for ASCII value " + num + " is: " + ch);

        sc.close();
    }
}
