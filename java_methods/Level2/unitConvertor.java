//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods.

import java.util.Scanner;

public class unitConvertor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Unit Converter Utility");
        System.out.println("1. Km to Miles");
        System.out.println("2. Miles to Km");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Fahrenheit to Celsius");
        System.out.println("10. Celsius to Fahrenheit");
        System.out.print("Choose an option: ");
        
        int choice = scanner.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double result = 0;
        
        switch (choice) {
            case 1: result = UnitConverter.convertKmToMiles(value); break;
            case 2: result = UnitConverter.convertMilesToKm(value); break;
            case 3: result = UnitConverter.convertMetersToFeet(value); break;
            case 4: result = UnitConverter.convertFeetToMeters(value); break;
            case 5: result = UnitConverter.convertYardsToFeet(value); break;
            case 6: result = UnitConverter.convertFeetToYards(value); break;
            case 7: result = UnitConverter.convertMetersToInches(value); break;
            case 8: result = UnitConverter.convertInchesToMeters(value); break;
            case 9: result = UnitConverter.convertFahrenheitToCelsius(value); break;
            case 10: result = UnitConverter.convertCelsiusToFahrenheit(value); break;
            default: System.out.println("Invalid option. Please try again."); return;
        }
        
        System.out.println("Converted value: " + result);
    }

     // Unit Converter Utility Class
     static class UnitConverter {
        public static double convertKmToMiles(double km) {
        	return km * 0.621371; 
        }
        public static double convertMilesToKm(double miles) {
        	return miles * 1.60934; 
        }
        public static double convertMetersToFeet(double meters) { 
        	return meters * 3.28084; 
        }
        public static double convertFeetToMeters(double feet) { 
        	return feet * 0.3048; 
        }
        public static double convertYardsToFeet(double yards) { 
        	return yards * 3; 
        }
        public static double convertFeetToYards(double feet) { 
        	return feet * 0.333333; 
        }
        public static double convertMetersToInches(double meters) { 
        	return meters * 39.3701; 
        }
        public static double convertInchesToMeters(double inches) { 
        	return inches * 0.0254; 
        }
        public static double convertFahrenheitToCelsius(double f) { 
        	return (f - 32) * 5 / 9; 
        }
        public static double convertCelsiusToFahrenheit(double c) { 
        	return (c * 9 / 5) + 32; 
        }
    }
}
