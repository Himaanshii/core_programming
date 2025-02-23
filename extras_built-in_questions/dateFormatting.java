//Date Formatting Write a program that:
//Displays the current date in three different formats:

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Example: 23/02/2025
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Example: 2025-02-23
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy"); // Example: Sun, Feb 23, 2025

        System.out.println("Current Date in dd/MM/yyyy format: " + currentDate.format(format1));
        System.out.println("Current Date in yyyy-MM-dd format: " + currentDate.format(format2));
        System.out.println("Current Date in EEE, MMM dd, yyyy format: " + currentDate.format(format3));
    }
    }