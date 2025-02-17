//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        if (number2 != 0) {
            double division = number1 / number2;
            System.out.println("Division result: " + division);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Addition result: " + addition);
        System.out.println("Subtraction result: " + subtraction);
        System.out.println("Multiplication result: " + multiplication);

        
        scanner.close();
    }
}
