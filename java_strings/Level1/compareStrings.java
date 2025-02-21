//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.*;
public class compareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String string1 = sc.nextLine().trim();
        System.out.println("Enter second string");
        String string2 = sc.nextLine().trim();
        boolean result = string1.equals(string2);

        System.out.println("Result using equals() method "+result);
        System.out.println("Result using charAt "+compare(string1, string2));
        if(compare(string1, string2) == result){
            System.out.println("Both methods give the same result.");
        }else{
            System.out.println("Both methods giving different results. ");
        }
    }

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
