//Write a program to demonstrate ArrayIndexOutOfBoundsException
import java.util.*;

public class arrayIndexOutOfBoundDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        System.out.println("Enter names ");
        String[] input = new String[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine();
        }
        handleException(input);

    }

    // method to generate exception
    public static void generateException(String[] s){
        String check = s[s.length];
        System.out.println(check);
    }
    // method to handle exception
    public static void handleException(String[] s){
        try{
            generateException(s);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Handled " + e);
        }
    }
}
