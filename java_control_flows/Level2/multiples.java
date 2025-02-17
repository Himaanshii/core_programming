//Create a program to find all the multiple of a number taken as user input below 100.
import java.util.*;
public class multiples{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its multiples below 100: ");
        int multipleNum = sc.nextInt();
        System.out.print("Multiples of " + multipleNum + " below 100: ");
        
        for (int i = 100; i >= 1; i--) {
            if (i % multipleNum == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        

    }
}