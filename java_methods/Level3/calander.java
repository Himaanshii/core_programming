//Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar
import java.text.DateFormatSymbols;
import java.util.*;
public class calander {
    public static void main(String[] args) {
        displayCalendar(7, 2005);
    }
    public static void displayCalendar(int month, int year) {
        Calendar cal = new GregorianCalendar(year, month - 1, 1);
        System.out.println(new DateFormatSymbols().getMonths()[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < startDay; i++) System.out.print("    ");
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay - 1) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}
