//Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;

public class oddAndeven {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a natural number: ");
        int num = input.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Not a natural number.");
        }
    }
    
}
