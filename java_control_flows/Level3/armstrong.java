//Create a program to check if a number is armstrong or not.
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number1 = input.nextInt();
        int originalNumber = number1;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        if (sum == number1) {
            System.out.println(number1 + " is an Armstrong number.");
        } else {
            System.out.println(number1 + " is NOT an Armstrong number.");
        }
    }
}
