//Write a program to check if a number is divisible by 5
import java.util.*;
public class divisibleBy5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5 ? " + (number % 5 == 0));
    }
}