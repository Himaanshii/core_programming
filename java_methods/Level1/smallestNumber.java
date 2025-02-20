//Write a program to find the smallest and the largest of the 3 numbers.
import java.util.*;
public class smallestNumber {
    public static int smallest(int num1, int num2, int num3){
        int small = num3;
        if(num1 > num2 && num3 > num2){
            small = num3;
        }else if(num2 > num1 && num3 > num1){
            small = num1;
        }
        return small;
    }
    public static int largest(int num1, int num2, int num3){
        int large = num1;
        if(num2 > num1 && num2 > num3){
            large = num2;
        }else if(num3 > num1 && num3 > num2){
            large = num3;
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int small = smallest(num1, num2, num3);
        int large = largest(num1 , num2, num3);
        System.out.println("Largest number is "+ large+" Smallest number is "+ small);
    }
}
