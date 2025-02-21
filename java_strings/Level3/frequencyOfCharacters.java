//Write a program to find the frequency of characters
import java.util.*;

import java.util.Scanner;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int[] result = frequency(s);
        System.out.println("Frequency of each character will be ");
        for (int i = 0; i < result.length; i++) {
            if(result[i] > 0){
                System.out.println((char)(i+'a') +" -> "+ result[i]);
            }
            
        }
    }

    // method to find frequency of characters in a string
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
