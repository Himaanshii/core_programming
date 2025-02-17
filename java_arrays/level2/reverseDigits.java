//Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order

import java.util.*;


public class reverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number8 = scanner.nextInt();
        int temp = number8;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits2 = new int[count];
        temp = number8;
        for (int i = 0; i < count; i++) {
            digits2[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits2[i]);
        }
        System.out.println();

        
        
       
    }
}
