//Write a program that performs basic mathematical operations (addition,
//subtraction, multiplication, division) based on user input.
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        double result = 0;
        boolean validChoice = true;

        if (choice == 1) {
            result = add(num1, num2);
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (choice == 2) {
            result = subtract(num1, num2);
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (choice == 3) {
            result = multiply(num1, num2);
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                result = divide(num1, num2);
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validChoice = false;
            }
        } else {
            System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            validChoice = false;
        }


    }

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        return a / b;
    }
}
