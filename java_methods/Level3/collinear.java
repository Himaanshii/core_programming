//Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.

import java.util.Scanner;

public class collinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2: ");
        int y2 = scanner.nextInt();
        System.out.println("Enter x3: ");
        int x3 = scanner.nextInt();
        System.out.println("Enter y3: ");
        int y3 = scanner.nextInt();
        
        
        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The numbers are collinear using the slope formula.");
        } else {
            System.out.println("The numbers are not collinear using the slope formula.");
        }
        
       
        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The numbers are collinear using the area formula.");
        } else {
            System.out.println("The numbers are not collinear using the area formula.");
        }
    }

    // Method to check collinearity using slope formula
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x2 - x1) == 0 && (x3 - x2) == 0 && (x3 - x1) == 0) {
            return false;
        }
        int slopeAB = (y2 - y1) / (x2 - x1);
        int slopeBC = (y3 - y2) / (x3 - x2);
        int slopeAC = (y3 - y1)  / (x3 - x1);
        if((slopeAB  == slopeAC) && (slopeAC == slopeBC) && (slopeAB == slopeBC) ){
            return true;
        }else{
            return false;
        }

        
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = (int)(0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
        return area == 0;
    }
}
