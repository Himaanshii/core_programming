//Write a program to find the side of the square whose parameter you read from user 
import java.util.*;

public class sideOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        System.out.println("The length of the side is " + (perimeter / 4) + " whose perimeter is " + perimeter);
    }
}
