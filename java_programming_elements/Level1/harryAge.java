//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
import java.util.*;

public class harryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear = 2000;
        int currentYear = 2024;
        System.out.println("Harry's age in 2024 is " + (currentYear - birthYear));
    }
}