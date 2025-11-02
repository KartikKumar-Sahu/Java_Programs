import java.util.Scanner;

public class Program160 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (true/false): ");
        String str = sc.nextLine();

        // Converting String to boolean
        boolean bool = Boolean.parseBoolean(str);

        System.out.println("The boolean value is: " + bool);

        sc.close();
    }
}

