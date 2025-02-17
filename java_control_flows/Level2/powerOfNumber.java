//Create a program to find the power of a number.
import java.util.*;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int power = input.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + power + " is: " + result);
    }
}
