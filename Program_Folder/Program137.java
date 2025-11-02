import java.util.Scanner;
import java.util.HashMap;

public class Program137 {

    public static int romanToInt(String roman) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = map.get(roman.charAt(i));
            int next = (i + 1 < roman.length()) ? map.get(roman.charAt(i + 1)) : 0;

            if (current < next)
                result -= current;
            else
                result += current;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int number = romanToInt(roman);

        System.out.println("The integer value is: " + number);

        sc.close();
    }
}
