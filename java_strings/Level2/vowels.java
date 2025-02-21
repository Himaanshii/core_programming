
import java.util.Scanner;
public class vowels {

    
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String input = sc.nextLine();
            sc.close(); 
    
            int[] counts = countVowelsAndConsonants(input);
            System.out.println("Vowel Count: " + counts[0]);
            System.out.println("Consonant Count: " + counts[1]);
        }
    
        // Method to check if a character is a vowel, consonant, or not a letter
        public static String checkCharacterType(char ch) {
            ch = Character.toLowerCase(ch); 
    
            if (ch >= 'a' && ch <= 'z') { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    return "Vowel";
                } else {
                    return "Consonant";
                }
            }
            return "Not a Letter";
        }
    
        // Method to count vowels and consonants
        public static int[] countVowelsAndConsonants(String str) {
            int vowelCount = 0, consonantCount = 0;
    
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String result = checkCharacterType(ch);
    
                if (result.equals("Vowel")) {
                    vowelCount++;
                } else if (result.equals("Consonant")) {
                    consonantCount++;
                }
            }
    
            return new int[]{vowelCount, consonantCount};
        }
    }

