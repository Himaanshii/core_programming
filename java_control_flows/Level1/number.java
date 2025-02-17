//Write a program to check whether a number is positive, negative, or zero.
import java.util.*;
public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        if (number1 > 0) {
            System.out.println("Positive");
        } else if (number1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
