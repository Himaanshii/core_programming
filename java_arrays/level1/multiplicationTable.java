//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

import java.util.*;
public class multiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number1 * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number1 + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}