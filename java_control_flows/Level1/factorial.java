//Write a Program to find the factorial of an integer entered by the user.
import java.util.*;

import java.util.Scanner;

public class factorial {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num >= 0) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
   } 
}
