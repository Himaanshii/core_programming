//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
import java.util.Scanner;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = scanner.nextDouble();

   
        double areaInInches = 0.5 * baseInches * heightInches;

        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;

        double areaInCm = 0.5 * baseCm * heightCm;

 
        System.out.println("Area of the triangle:");
        System.out.println("In square inches: " + areaInInches);
        System.out.println("In square centimeters: " + areaInCm);

        double heightFeet = heightInches / 12;
        double heightInchesOnly = heightInches % 12;

        System.out.println("\nYour Height in cm is: " + heightCm + " cm");
        System.out.println("While in feet is: " + heightFeet + " feet");
        System.out.println("And in inches is: " + heightInchesOnly + " inches");

    }
}
