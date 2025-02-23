//Write a Java program to count how many times a given substring occurs in a string.
import java.util.Scanner;

import java.util.*;

public class substringOccurence {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        
        System.out.println("Enter the substring to count:");
        String subString = sc.nextLine();
        
        int count = countOccurrences(mainString, subString);
        System.out.println("Occurrences: " + count);
    }

    // method to count occurences
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int mainLen = mainStr.length();
        int subLen = subStr.length();
        for (int i = 0; i <= mainLen - subLen; i++) {
            boolean match = true;
            for (int j = 0; j < subLen; j++) {
                if (mainStr.charAt(i + j) != subStr.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        return count;
    }

}
