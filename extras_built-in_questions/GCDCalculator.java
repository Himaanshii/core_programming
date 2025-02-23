// Create a program that calculates the Greatest Common Divisor (GCD) and Least
//Common Multiple (LCM) of two numbers using functions.

import java.util.*;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2, gcd);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
     // Function to find the GCD using the Euclidean Algorithm
     public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Function to find the LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
