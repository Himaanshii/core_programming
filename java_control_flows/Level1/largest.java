//Write a program to check if the first, second, or third number is the largest of the three.
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
         int num3 = sc.nextInt();
        System.out.println("Is the first number the largest ? " + (num1 > num2 && num1 > num3));
        System.out.println("Is the second number the largest ? " + (num2 > num1 && num2 > num3));
        System.out.println("Is the third number the largest ? " + (num3 > num1 && num3 > num2));
    }
}
