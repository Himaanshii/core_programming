import java.util.*;

public class NullPointerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to demonstrate");
        String input = sc.nextLine();
        handleNullPointerException(input);
    }

    public static void handleNullPointerException(String s){
        try{
            generateException();
        }catch (NullPointerException e) {
            System.out.println("Handled NullPointerException"+e);
        }
    }

    public static void generateException(){
        String text = null;
        System.out.println(text.length());
    }
    
}
