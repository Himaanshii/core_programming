//Write a program to convert the complete text to lowercase and compare the results
//In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
import java.util.*;

public class toLowerCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string");
       String input = sc.nextLine();
       String result1 = lowerCase(input);
       String result2 = input.toLowerCase(); 
       System.out.println("Resultant string will be using user-defined method " + result1);
       if (compare(result1, result2)) {
        System.out.println("Both method give the same results");
       }else{
        System.out.println("Both method doesn't give the same results");
       }
    }

    // method to convert string into lowercase caharacters
    public static String lowerCase(String s){
        StringBuilder result = new StringBuilder() ;
        int i =0;
        for( i = 0; i<s.length(); i++){
            if(s.charAt(i) < 97){
                result.append((char)(s.charAt(i) + 32));
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
