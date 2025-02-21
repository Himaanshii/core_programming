//Write a program to find and return the length of a string without using the length() method 
import java.util.*;
public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String input = sc.nextLine();
        int result1 = findLength(input);
        int result2 = input.length();
        if(result1 == result2){
            System.out.println("Both method give the same results ");
        }else{
            System.out.println("Both methods gives different results ");
        }
    }

    // method to find length
    public static int findLength(String s){
        char[] arr = s.toCharArray();
        int length = 0;
        for(char ch :arr){
            length++;
        }
    return length;
    }

}
