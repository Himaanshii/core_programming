//Write a program that:
//Takes two date inputs and compares them to check if the first date is before, after,
//or the same as the second date.

import java.time.LocalDate;
import java.util.Scanner;

public class dateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first date (YYYY-MM-DD):");
        String firstDateInput = sc.nextLine();
        
        System.out.println("Enter the second date (YYYY-MM-DD):");
        String secondDateInput = sc.nextLine();

        // Convert the input strings into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateInput);
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Compare the dates 
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
