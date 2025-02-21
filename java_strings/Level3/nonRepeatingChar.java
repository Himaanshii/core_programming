//Write a program to find the first non-repeating character in a string and show the result
import java.util.*;
public class nonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String input = sc.nextLine();
        char result = nonrepeatingChar(input);
        System.out.println("First non-repeating character is "+ result);

    }

    // to find occurence of first non-repeating character
    public static char nonrepeatingChar(String s){
        int[] frequency = frequency(s);
        
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(frequency[ch-'a'] == 1 && ch>='a' && ch<='z'){
             return ch;  
            }
        }
        return '0';
    }

    // to find frequency
    public static int[] frequency(String s){

        int[] frequency = new int[26];
        for(int i =0; i<s.length(); i++){
           if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
            frequency[s.charAt(i)-'a']++;
           }
                
        }
        return frequency;
    }
}
