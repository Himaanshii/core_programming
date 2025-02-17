//Create a program to check if a number taken from the user is a Harshad Number.
/*A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).*/
import java.util.Scanner;

public class harshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Harshad Number: ");
        int fristnum = input.nextInt();
        int sum1 = 0, temp = fristnum;

        while (temp > 0) {
            sum1 += temp % 10;
            temp /= 10;
        }

        if (fristnum % sum1 == 0) {
            System.out.println(fristnum + " is a Harshad Number.");
        } else {
            System.out.println(fristnum + " is NOT a Harshad Number.");
        }
    }
}
