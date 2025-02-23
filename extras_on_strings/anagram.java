//Write a Java program that accepts two strings from the user and checks if the two
//strings are anagrams of each other (i.e., whether they contain the same characters in any
//order).
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String input1 = sc.nextLine();
        System.out.println("Enter String2");
        String input2 = sc.nextLine();
        if(ifAnagrams(input1, input2)){
            System.out.println("Strings are Anagrams");
        }else{
            System.out.println("Strings are not Anagrams");
            
        }
    }

    // method to check if they are anagrams or not
    public static boolean ifAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] frequency1 = findFrequency(s1);
        int[] frequency2 = findFrequency(s2);
        
        if(ifArraysEqual(frequency1, frequency2)){
            return true;
        }
        return false;

    }

    // method to find frequency 
    public static int[] findFrequency(String s){
        int[] frequency = new int[26];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                frequency[s.charAt(i) -'a']++;
            }
            
        }
        return frequency;
    }

    // method to check if two arrays are equal
    public static boolean ifArraysEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
