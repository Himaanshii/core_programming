//Write a program to check if the first is the smallest of the 3 numbers.
import java.util.*;
public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Is the first number the smallest ? " + (num1 < num2 && num1 < num3));
    }
}
