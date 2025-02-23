//Write a program that generates the Fibonacci sequence up to a specified number
import java.util.*;
public class fibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        generateFibonacci(n);
    }

     // Function to generate and print the Fibonacci sequence
     public static void generateFibonacci(int n) {
        int first = 0, second = 1; 
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.print("Fibonacci Sequence: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " "); 
            int next = first + second; 
            first = second; 
            second = next;
        }

        System.out.println(); 
}
}
