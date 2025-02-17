//Create a program to check if a number is an Abundant Number.
//An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself.

import java.util.Scanner;

public class abundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Abundant Number: ");
        int fristnum = input.nextInt();
        int sum1 = 0;

        for (int i = 1; i < fristnum; i++) {
            if (fristnum % i == 0) {
                sum1 += i;
            }
        }

        if (sum1 > fristnum) {
            System.out.println(fristnum + " is an Abundant Number.");
        } else {
            System.out.println(fristnum + " is NOT an Abundant Number.");
        }
    }
}
