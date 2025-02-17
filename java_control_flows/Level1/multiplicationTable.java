//Create a program to find the multiplication table of a number entered by the user from 6 to 9.
import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num5 = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num5 + " * " + i + " = " + (num5 * i));
        }
    }
    }
   
