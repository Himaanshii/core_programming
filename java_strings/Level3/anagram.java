// Write a program to check if two strings are anagrams 
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String input1 = sc.nextLine();
        System.out.println("Enter second String");
        String input2 = sc.nextLine();
        if(ifAnagram(input1, input2)){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }
        
    }

    // to check if anagrams
    public static boolean ifAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int[] frequency1 = findFrequency(s1);
        int[] frequency2 = findFrequency(s2);
        if(checkIfEqual(frequency1, frequency2)){
            return true;
        }

        return false;
    }

    // to find frequency 
    public static int[] findFrequency(String s){
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                frequency[s.charAt(i)-'a']++;
               }
        }
        return frequency;
    }

    // to check if two arrays are equal
    public static boolean checkIfEqual(int[] arr1, int[] arr2){
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
