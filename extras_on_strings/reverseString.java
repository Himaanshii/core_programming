//Write a Java program to reverse a given string without using any built-in reverse functions.
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        String result = reverse(input);
        System.out.println(result);
    }

    // method to reverse string
    public static String reverse(String s){
        String result = new String();
        for(int i=s.length()-1; i>=0; i--)
        {
            result += s.charAt(i);
        }
        return result;
    }
}
