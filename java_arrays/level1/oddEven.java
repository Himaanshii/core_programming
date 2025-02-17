//Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array

import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number11 = scanner.nextInt();

        if (number11 <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        int[] evenNumbers = new int[number11 / 2 + 1];
        int[] oddNumbers = new int[number11 / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number11; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
