//Write a program calculate the wind chill temperature given the temperature and wind speed
//Write a method to calculate the wind chill temperature using the formula 
//windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16import java.util.Scanner;
import java.util.*;

public class calculateWindChill {
    public static double calculateWindChill1(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.println("Enter wind speed in mph: ");
        double windSpeed = sc.nextDouble();

        
        if (windSpeed < 3) {
            System.out.println("Wind chill temperature calculation is not valid for wind speeds below 3 mph.");
        } else {
            
            double windChill = calculateWindChill1(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }

        
    }
}
