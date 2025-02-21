//Find unique characters in a string using the charAt() method and display the result
import java.util.*;

public class uniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        char[] result = uniqueCharacters(input);
        System.out.println("unique characters are ");
       for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]+" ");
       }

    }

    //method to find unique Characters
    public static char[] uniqueCharacters(String s){
        
        char[] arr = s.toCharArray();
        char[] unique = new char[findLength(s)];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            boolean isUnique = true;
            for(int j =0; j<i; j++){
                if(arr[i] == arr[j] ){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                unique[index] = arr[i];
                index++;
            }
        }
        return Arrays.copyOf(unique, index);
    }

    //Method to find length of string
    public static int findLength(String s){
        char[] arr = s.toCharArray();
        int length = 0;
        for(char ch: arr){
            length++;
        }
        return length;
    }
    
}
