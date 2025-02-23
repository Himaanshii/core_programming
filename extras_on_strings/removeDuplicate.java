//Write a Java program to remove all duplicate characters from a given string and return
//the modified string.
import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        String result = remove(input);
        System.out.println(result);
    }
    // method to remove duplicate
    public static String remove(String s) {
        String result = "";
        boolean[] isPresent = new boolean[256]; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isPresent[ch]) { 
                result += ch;
                isPresent[ch] = true;
            }
        }
        return result;
    }
}
