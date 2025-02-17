//Create a program to print a multiplication table of a number.

import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number");
        int n = sc.nextInt();
        int[] results = new int[10];
        for(int i = 1; i<=10; i++){
            results[i] = n*i;
            System.out.println(n+"*"+i+" = "+ results[i]);
        }
        
    }
}
