//Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is positive and " + (isEven(num) ? "even." : "odd."));
            } else {
                System.out.println(num + " is negative.");
            }
        }
        
        int comparison = compareNumbers(numbers[0], numbers[4]);
        if (comparison == 0) {
            System.out.println("The first and last numbers are equal.");
        } else if (comparison > 0) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
        
        
    }

    // Method to check positive/negative number
    public static boolean isPositive(int num) { return num > 0; }

    // Method to check even/odd
    public static boolean isEven(int num) { return num % 2 == 0; }

    // Method to compare numbers
    public static int compareNumbers(int num1, int num2) {
        return Integer.compare(num1, num2);
    }
}
