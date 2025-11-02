import java.util.Scanner;

public class Program117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount, count, totalNotes = 0;

        System.out.print("Enter the amount: ");
        amount = sc.nextInt();

        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Currency Note Count:");

        for (int i = 0; i < notes.length; i++) {
            count = amount / notes[i];
            if (count != 0) {
                System.out.println(notes[i] + " : " + count);
            }
            totalNotes += count;
            amount = amount % notes[i];
        }

        System.out.println("Total number of notes = " + totalNotes);
        sc.close();
    }
}
