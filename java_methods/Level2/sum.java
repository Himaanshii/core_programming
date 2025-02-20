//Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find sum of natural numbers: ");
        int n = scanner.nextInt();
        System.out.println("Sum using recursion: " + sumOfNaturalNumbers(n));
        System.out.println("Sum using formula: " + sumUsingFormula(n));
    }
    // Recursive method to find sum of n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) return 1;
        return n + sumOfNaturalNumbers(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
