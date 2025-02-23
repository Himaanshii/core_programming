//Write a Java program to find the most frequent character in a string.
import java.util.*;
public class frequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String input = sc.nextLine();
        if (findFrequentCharacter(input) == '\0') {
            System.out.println("No valid character in String");
        }else{
        System.out.println("Most frequent character in string "+findFrequentCharacter(input));
        }
    }

    // method to find frequent character
    public static char findFrequentCharacter(String s){
        String s1 = s.toLowerCase();
        if(s.length() == 0){
            return '\0';
        }
        int[] frequency = new int[26];
        for(int i =0; i<s1.length(); i++){
            frequency[s1.charAt(i)-'a']++;
        }
        int max = frequency[0];
        int index = 0;
        for (int i = 1; i < frequency.length; i++) {
            if(frequency[i] > max){
                max = frequency[i];
                index = i;
            }
        }
        return (char)(index+'a');
    }
}
