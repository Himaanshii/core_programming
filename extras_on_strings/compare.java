//Write a Java program to compare two strings lexicographically (dictionary order) without
//using built-in compare methods.
import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println("The first string is lexicographically smaller.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically larger.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

       
        return len1 - len2;
    }
}
