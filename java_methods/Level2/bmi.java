//An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int teamSize = 10;
        double[] weights = new double[teamSize];
        double[] heights = new double[teamSize];
        double[] bmis = new double[teamSize];
        String[] statuses = new String[teamSize];
        
        for (int i = 0; i < teamSize; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            
            bmis[i] = calculateBMI(weights[i], heights[i]);
            statuses[i] = getBMIStatus(bmis[i]);
        }
        
        System.out.println("\nBMI Report:");
        for (int i = 0; i < teamSize; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + heights[i] + " cm, Weight: " + weights[i] + " kg, BMI: " + bmis[i] + ", Status: " + statuses[i]);
        }
        
    }
    // Method to find BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
