import java.util.*;
public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String to demonstrate ");
        String input = sc.nextLine();
        handleException(input);
    }

    // method to create exception
    public static void generateException(String s){
        System.out.println(s.charAt(s.length()));
    }

    // method to handle exception
    public static void handleException(String s){
        try{
            generateException(s);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Handled Exception" + e);
        }
    }
}
