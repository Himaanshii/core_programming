//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
      
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num2 != 0 ? num1 / num2 : Double.NaN;
      
        if (num2 != 0) {
            System.out.println("O/P => The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + sum + ", " + difference + ", " + product + ", and " + quotient);
        } else {
            System.out.println("O/P => The addition, subtraction, multiplication value of 2 numbers " + num1 + " and " + num2 + " is " + sum + ", " + difference + ", " + product + ", and Division is Undefined (cannot divide by zero)");
        }
    }
}
