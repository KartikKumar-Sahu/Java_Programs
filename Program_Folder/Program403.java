// Program403.java
// Program to add characters to a string

import java.util.Scanner;

public class Program403 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the original string
        System.out.print("Enter the original string: ");
        String str = sc.nextLine();

        // Input the character(s) to add
        System.out.print("Enter character(s) to add: ");
        String toAdd = sc.nextLine();

        // ---- Method 1: Using String concatenation ----
        String newStr = str + toAdd;
        System.out.println("\nAfter adding characters (using + operator): " + newStr);

        // ---- Method 2: Using StringBuffer ----
        StringBuffer sb = new StringBuffer(str);
        sb.append(toAdd);
        System.out.println("After adding characters (using StringBuffer): " + sb.toString());

        // ---- Method 3: Using StringBuilder ----
        StringBuilder sbuild = new StringBuilder(str);
        sbuild.append(toAdd);
        System.out.println("After adding characters (using StringBuilder): " + sbuild.toString());

        sc.close();
    }
}
