//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
import java.util.*;
public class chocolates {
    public static int[] quotientDivisor(int n , int p){
        int quotient = n/p;
        int remainder = n%p;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Chocolates ");
        int n = sc.nextInt();
        System.out.println("Enter number of children ");
        int p = sc.nextInt();
        int[] answer = quotientDivisor(n, p);
        int quotient = answer[0];
        int remainder = answer[1];
        System.out.println("Number of Chocolates each child gets "+quotient);
        System.out.println(" Numnber of remaining chocolates "+remainder);
    }
}
