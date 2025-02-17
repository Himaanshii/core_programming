//Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
import java.util.*;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers1 = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (max 10). Enter 0 or a negative number to stop:");
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers1[index++] = num;
        }

        System.out.println("Stored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers1[i] + " ");
            total += numbers1[i];
        }

        System.out.println("\nSum of all numbers: " + total);;
    }
}
