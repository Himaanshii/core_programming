//Write a program to find the sum of n natural numbers using loop
import java.util.*;
public class natural {
    public static int sum(int n){
        int sum1 = 0;
        for(int i = 0; i<=n; i++){
            sum1 += i; 
        }
        return sum1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int answer = sum(n);
        System.out.println("The sum of "+n+" natural numbers is "+answer);

    }
}
