//Write a program that checks if a given string is a palindrome (a word, phrase, or
//sequence that reads the same backward as forward).

import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }
    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase(); 
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
