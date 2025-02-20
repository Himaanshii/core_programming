//Write a program that takes a year as input and outputs the Year is a Leap Year or not 

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a year to check leap year: ");
        int year = scanner.nextInt();
        System.out.println(year + " is a Leap Year? " + isLeapYear(year));
    }
    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
