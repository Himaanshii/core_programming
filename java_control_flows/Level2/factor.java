//Create a program to find the factors of a number taken as user input.
import java.util.Scanner;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int factorNum = input.nextInt();
        System.out.print("Factors of " + factorNum + " are: ");
        for (int i = 1; i <= factorNum; i++) {
            if (factorNum % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
