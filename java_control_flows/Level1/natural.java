//Write a program to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;

import java.util.*;
public class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n =sc.nextInt();
        if (n > 0) {
            System.out.println("The sum of " + n + " natural numbers is " + (n * (n + 1) / 2));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
