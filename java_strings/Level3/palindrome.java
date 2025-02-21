//Write a program to to check if a text is palindrome and display the result
import java.util.*;

public class palindrome{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first String ");
       String input = sc.nextLine(); 
       if(checkIfPalindrome(input)){
        System.out.println("String is Palindrome ");
       }else{
        System.out.println("String is not palindrome ");
       }
       
    }

    public static boolean checkIfPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}