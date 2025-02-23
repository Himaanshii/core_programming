//Write a program that takes three integer inputs from the user and finds the
//maximum of the three numbers
import java.util.Scanner;

import java.util.Scanner;


public class maximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        int num1 = getNumberFromUser(sc, "Enter the first number: ");
        int num2 = getNumberFromUser(sc, "Enter the second number: ");
        int num3 = getNumberFromUser(sc, "Enter the third number: ");

        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);   
    }

     // Function to take input from the user
    public static int getNumberFromUser(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();  
   }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        int max = a; 
        if (b > max) {
            max = b; 
        }
        if (c > max) {
            max = c; 
        }
        return max; 
    }
}
