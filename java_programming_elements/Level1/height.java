//Write a program that takes your height in centimeters and converts it into feet and inches
import java.util.*;
public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
        double heightInches = heightCm / 2.54, heightFeet = heightInches / 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int) heightFeet + " and inches is " + (heightInches % 12));
    }
}
