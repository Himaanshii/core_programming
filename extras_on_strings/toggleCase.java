//Write a Java program to toggle the case of each character in a given string. Convert uppercase letters to lowercase and vice versa.

import java.util.Scanner;

public class toggleCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String input = sc.nextLine();
    String result = "";
    
    
    for(int i=0; i<input.length(); i++){
        if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
            result += toLowerCase(input.charAt(i));
        }else{
            result += toUpperCase(input.charAt(i));
        }
    }
        
        System.out.println(result);
  } 

  //method to convert uppercase to lowercase
  public static char toLowerCase(char ch){

        if(ch>='A' && ch<='Z'){
            ch = ((char)(ch+32));
        }
    return ch;
  }

  //method to convert lowercase to uppercase
  public static char toUpperCase(char ch){

    if(ch>='a' && ch<='z'){
        ch = ((char)(ch-32));
    }

return ch;
}

  
  
  
}
