//Create a program to print the greatest factor of a number beside itself using a loop.

import java.util.Scanner;

public class greatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its greatest factor: ");
        int number1 = input.nextInt();
        int greatestFactor = 1;

        for (int i = number1 - 1; i >= 1; i--) {
            if (number1 % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor (excluding itself): " + greatestFactor);
    }
    
}
