// Program208.java
import java.util.Scanner;

public class Program208 {

    // Method to print characters between two given characters
    public static void printCharacters(char start, char end) {
        if (start > end) {
            System.out.println("Invalid range! Start character should be less than or equal to end character.");
            return;
        }

        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting character: ");
        char start = sc.next().charAt(0);

        System.out.print("Enter ending character: ");
        char end = sc.next().charAt(0);

        System.out.println("Characters between " + start + " and " + end + ":");
        printCharacters(start, end);

        sc.close();
    }
}
