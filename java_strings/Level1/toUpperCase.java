//Write a program to convert the complete text to uppercase and compare the results
import java.util.*;

public class toUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String input = sc.nextLine();
        String result1 = upperCase(input);
        String result2 = input.toUpperCase();
        System.out.println("Resultant string using user-defined method will be "+ result1);
        if (compare(result1, result2)) {
            System.out.println("Both methods give the same results ");
        }else{
            System.out.println("Both methods dosn't give the same results ");
        }
    }

    // Method to convert string into uppercase
    public static String upperCase(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 97){
                result.append((char)(s.charAt(i) - 32));
            }else{
                result.append(s.charAt(i));
            }
            
        }
        return result.toString();
    }

    // meyhod to compare two strings
    public static boolean compare(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
            
        }
        return true;
            }
}
