//Write a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Display the results
        System.out.println("Your distance in yards is: " + distanceInYards);
        System.out.println("Your distance in miles is: " + distanceInMiles);
    }
}
