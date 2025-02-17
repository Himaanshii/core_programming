//Create a program to print odd and even numbers between 1 to the number entered by the user.
import java.util.*;

public class oddAndeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int limit = input.nextInt();
        if (limit > 0) {
            for (int i = 1; i <= limit; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Enter a valid natural number.");
        }
    }
}
