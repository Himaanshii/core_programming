//Write a program to take 2 numbers and print their quotient and reminder
import java.util.*;
public class quotient {
    public static int[] quotientDivisor(int n , int p){
        int quotient = n/p;
        int remainder = n%p;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        System.out.println("enter divisor ");
        int p = sc.nextInt();
        int[] answer = quotientDivisor(n, p);
        int quotient = answer[0];
        int remainder = answer[1];
        System.out.println("Quotient is "+quotient);
        System.out.println(" Remainder is "+remainder);
    }
}
