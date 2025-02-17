//Create a program to find the bonus of employees based on their years of service.

//Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
import java.util.*;

public class bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus as service is less than 5 years.");
        }
    }
}
