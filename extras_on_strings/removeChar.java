//Write a Java program to remove all occurrences of a specific character from a string.
import java.util.*;

import java.util.Scanner;

public class removeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        System.out.println("Enter character you want to remove");
        char ch = sc.next().charAt(0); // sc.next() will be considered as string so , charAt will extract first char of that string
        String result = removedString(input, ch);
        System.out.println("Resultant string will be "+result);
    }

    // method to remove specof character from string

    public static String removedString(String s, char ch){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) != ch){
            result += s.charAt(i);
           } 
        }
        return result;
    }
}
