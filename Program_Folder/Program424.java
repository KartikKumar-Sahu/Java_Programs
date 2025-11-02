// Program424.java
// Program to find the most repeated word in a text file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program424 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path to the text file: ");
        String path = sc.nextLine().trim();

        Map<String, Integer> freq = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Normalize: lowercase, remove punctuation -> keep letters/digits/spaces
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", " ");
                // Split on one or more spaces
                String[] words = line.trim().split("\\s+");

                for (String w : words) {
                    if (w.isEmpty()) continue;
                    freq.put(w, freq.getOrDefault(w, 0) + 1);
                }
            }

            if (freq.isEmpty()) {
                System.out.println("\nNo words found in the file.");
                return;
            }

            // Find the most repeated word (max frequency)
            String mostWord = null;
            int mostCount = 0;

            for (Map.Entry<String, Integer> e : freq.entrySet()) {
                if (e.getValue() > mostCount || (e.getValue() == mostCount && e.getKey().compareTo(mostWord) < 0)) {
                    mostWord = e.getKey();
                    mostCount = e.getValue();
                }
            }

            System.out.println("\nMost repeated word: \"" + mostWord + "\" (appears " + mostCount + " times)");

            // Optional: show top 10 words
            System.out.print("\nShow top 10 words? (y/n): ");
            String ans = sc.nextLine().trim();
            if (ans.equalsIgnoreCase("y")) {
                List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
                list.sort((a, b) -> {
                    int c = Integer.compare(b.getValue(), a.getValue());
                    return c != 0 ? c : a.getKey().compareTo(b.getKey());
                });
                System.out.println("\nTop words:");
                int limit = Math.min(10, list.size());
                for (int i = 0; i < limit; i++) {
                    System.out.printf("%2d) %-20s %d%n", i + 1, list.get(i).getKey(), list.get(i).getValue());
                }
            }

        } catch (IOException e) {
            System.out.println("\nError reading file: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
