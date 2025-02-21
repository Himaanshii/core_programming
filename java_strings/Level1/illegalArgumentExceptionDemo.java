import java.util.*;
public class illegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to demonstrate");
        String input = sc.nextLine();
        handleException(input);
    }

    // method to generate exception
    public static void generateException(String s){
        if (s.length() < 2) {  
            throw new IllegalArgumentException("String must have at least 2 characters!");
        }
        System.out.println(s.substring(1,s.length() -1));
    }

    // method to handle exception
    public static void handleException(String s){
        try{
            generateException(s);
        }catch(IllegalArgumentException e){
            System.out.println("Handled Exception "+e);
        }
    }
}
