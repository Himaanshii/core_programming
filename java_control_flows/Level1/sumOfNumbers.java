//Write a program to find the sum of numbers until the user enters 0
import java.util.*;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double value;
        
        System.out.println("Enter numbers (0 to stop): ");
        
        while (true) {
            value = sc.nextDouble();
            if (value == 0) {
                break;
            }
            total += value;
        }
        
        System.out.println("Total sum: " + total);
       
    
    }
}
