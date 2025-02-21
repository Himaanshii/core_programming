import java.util.*;
public class numberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String input = sc.nextLine();
        handleException(input);
    }

    // method to generate exception
    public static void generateException(String s){
        int n = Integer.parseInt(s);
        if(n < 1){
            throw new NumberFormatException("String must have a number");
        }
    }

    // method to handle exception
    public static void handleException(String s){
        try{
            generateException(s);
        }catch(NumberFormatException e){
            System.out.println("Handled Exception" + e);
        }
    }
}
