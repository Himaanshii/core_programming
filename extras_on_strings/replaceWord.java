//Write a replace method in Java that replaces a given word with another word in a sentence:

import java.util.Scanner;

public class replaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String input = sc.nextLine();
        System.out.println("Enter word you want to replace " );
        String oldWord = sc.nextLine();
        System.out.println("Enter word you want to replace with ");
        String newWord = sc.nextLine();
        String result = newString(input, oldWord, newWord);
        System.out.println("Resultant strig will be "+ result); 
    }

    // method to replace Word 
    public static String newString(String s, String oldWord , String newWord){
        String[] words = s.split(" ");
        String updatedString = "";
        for(String word: words){
            if(word.equals(oldWord)){
                updatedString += newWord;
            }else{
                updatedString += word;
            }
            updatedString +=" ";
        }
        return updatedString;
    }
}
