//Write a Java program to check if a given string is a palindrome (a string that reads the same forward and backward).
import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("String is Palindrome ");
        }else{
            System.out.println("string is not Palindrome");
        }
    }

    // method to check palindrome
    public static boolean isPalindrome(String s){
        int i=0; 
        int j=s.length()-1;
        while(i<j){
            if( s.charAt(i) != s.charAt(j) ){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}