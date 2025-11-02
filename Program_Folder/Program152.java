import java.util.Scanner;

public class Program152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Converting String to Object (Upcasting)
        Object obj = str;

        System.out.println("Converted Object: " + obj);
        System.out.println("Object Class Type: " + obj.getClass().getName());

        sc.close();
    }
}
