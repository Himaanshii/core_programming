//Write a Java program that takes a sentence as input and returns the longest word in the sentence.

import java.util.Scanner;



public class longestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        int max = findLength(words[0]);
        String result = " ";
        for(int i=1; i<words.length; i++){
            if (findLength(words[i] )> max) {
                max = findLength(words[i]);
                result = words[i];
            }
        }
        System.out.println(result);
    }

    // method to find length of a word
    public static int findLength(String s){
        if(s.length() == 0){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        return count;
    }
}
