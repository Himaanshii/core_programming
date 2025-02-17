//Write a program to create a calculator using switch...case.
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = input.next().charAt(0);
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        double result;
        switch (op) {
            case '+':
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }
}
