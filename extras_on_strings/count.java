//Write a Java program to count the number of vowels and consonants in a given string.
import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        int[] result = countConsonantOrVowel(input);

        if(input.length() == 0){
            System.out.println("Empty string ");
        }else{
            System.out.println("Number of Vowels " +result[0]);
        System.out.println("Number of Consonants " +result[1]);
        }
        

    }

    // method to count number of consonant and vowels
    public static int[] countConsonantOrVowel(String s){
        
        int countVowel = 0;
        int countConsonant = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
            if(ifConsonantOrVowel(s.charAt(i)) == 0){
                countVowel++;
            }else if(ifConsonantOrVowel(s.charAt(i)) == 1){
                countConsonant++;
            }
        }
        int[] count = {countVowel,countConsonant};
        
        return count;
    }

    // methhod to find whether it is a consonant or a vowel
    public static int ifConsonantOrVowel(char ch){
        ch = Character.toLowerCase(ch);;
       
            if(ch>='a' &&ch <='z'){
                if(ch == 'a' || ch =='e' || ch =='i' || ch =='o'|| ch == 'u' ){
                     return 0;
                }else{
                    return 1;
                }
            }
        
        return -1;
        
    }
}
