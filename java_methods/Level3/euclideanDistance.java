//Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
import java.util.*;

import java.util.Scanner;

public class euclideanDistance {
    public static void main(String[] args) {


         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        
        findEquation(x1, y1, x2, y2);
        
       
    }
    

            // Method to calculate Euclidean distance
            public static double calculateDistance(double x1, double y1, double x2, double y2) {
                return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            }

            public static void findEquation(double x1, double y1, double x2, double y2) {
                if (x1 == x2) {
                    System.out.println("The line is vertical, slope is undefined.");
                    return;
                }
                
                double slope = (y2 - y1) / (x2 - x1);
                double yIntercept = y1 - slope * x1;
                
                System.out.println("Equation of the line: y = " + slope + "x + " + yIntercept);
            }
        
}
