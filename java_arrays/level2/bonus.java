//Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
//Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years

import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        int[] yearsOfService = new int[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double sal = scanner.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            int years = scanner.nextInt();

            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter valid values.");
                i--; // Re-enter for this employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < EMPLOYEES; i++) {
            bonus[i] = (yearsOfService[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
    }
    
}
