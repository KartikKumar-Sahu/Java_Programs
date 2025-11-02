// Program415.java
// Program to find (print) all subsets of a string using bitmasking

import java.util.*;

public class Program415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        List<String> subsets = allSubsets(s);

        // Print results
        System.out.println("\nAll subsets (" + subsets.size() + "):");
        for (String sub : subsets) {
            System.out.println(sub);
        }

        sc.close();
    }

    // Returns all subsets (power set) of the string s (order preserved)
    private static List<String> allSubsets(String s) {
        int n = s.length();
        int total = 1 << n; // 2^n
        List<String> result = new ArrayList<>(total);

        for (int mask = 0; mask < total; mask++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sb.append(s.charAt(i));
                }
            }
            result.add(sb.toString()); // includes empty subset ""
        }
        return result;
    }
}
