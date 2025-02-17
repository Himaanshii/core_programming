//Create a program to count the number of digits in an integer
import java.util.*;
public class numberOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int number1 = input.nextInt();
        int count = 0;
        int originalNumber = number1;

        while (originalNumber != 0) {
            originalNumber /= 10;
            count++;
        }

        System.out.println("The number of digits in " + number1 + " is: " + count);
    }
}
