//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;

public class numbers {
    public int num(int a){
        if(a<0){
            return -1;
        }else if(a == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numbers num1= new numbers();
        System.out.println("Enter number ");
        int a = sc.nextInt();
        int answer = num1.num(a);
        System.out.println(answer);
    }
}
