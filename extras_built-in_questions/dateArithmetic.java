//Create a program that:
//Takes a date input and adds 7 days, 1 month, and 2 years to it.
//Then subtracts 3 weeks from the result.
import java.time.LocalDate;
import java.util.*;

public class dateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter a date (YYYY-MM-DD):");
        String inputDate = sc.nextLine(); 

        // Convert the input string to a LocalDate object
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the result
        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("Original Date: " + date);
        System.out.println("After Adding 7 days, 1 month, and 2 years: " + addedDate);
        System.out.println("After Subtracting 3 weeks: " + finalDate);

    }
}
