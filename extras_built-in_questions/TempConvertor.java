//Write a program that converts temperatures between Fahrenheit and Celsius. ○
import java.util.*;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Choose conversion type:");
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Fahrenheit");
        int choice = sc.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F is equal to " + celsius + "°C");
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C is equal to " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
