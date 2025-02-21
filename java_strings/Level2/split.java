//Write a program to split the text into words, compare the result with the split() method and display the result 
import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] words = splitWords(input);

       String[][] wordLengths = storeWordLengths(words);
        int[] minMaxIndexes = findShortestLongest(wordLengths);System.out.println("Shortest Word: " + wordLengths[minMaxIndexes[0]][0] + 
                           " (Length: " + wordLengths[minMaxIndexes[0]][1] + ")");
        System.out.println("Longest Word: " + wordLengths[minMaxIndexes[1]][0] + 
                           " (Length: " + wordLengths[minMaxIndexes[1]][1] + ")");
    }

    // Method to split text into words using charAt()
    public static String[] splitWords(String s) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[countWords(s)];
        int index = 0;

        for (int i = 0; i < findLength(s); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                words[index++] = word.toString();
                word.setLength(0); 
            }
        }
        if (word.length() > 0) {
            words[index] = word.toString(); 
        }
        return words;
    }

    // Method to count words manually
    public static int countWords(String s) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    // Method to find length of a string without using length()
    public static int findLength(String s) {
        int length = 0;
        for (char ignored : s.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to store words with their lengths in a 2D array
    public static String[][] storeWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; 
            wordLengths[i][1] = String.valueOf(findLength(words[i])); 
        
    }
    return wordLengths;
}

    // Method to find shortest and longest words
    public static int[] findShortestLongest(String[][] wordLengths) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.MAX_VALUE, maxLength = 0;

        for (int i = 0; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]); 
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

}
