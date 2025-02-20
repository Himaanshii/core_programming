  //Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results

import java.util.*;
public class factors {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = scanner.nextInt();
        int[] factors = findFactors(num);
        
        System.out.println("Factors: " + Arrays.toString(factors));
        
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        
        
        System.out.println("Product of factors: " + productOfFactors(factors));
        
        
        System.out.println("Sum of squares of factors: " + sumOfSquareOfFactors(factors));
    }
        // Method to find factors of a number and return an array
        public static int[] findFactors(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) count++;
            }
            int[] factors = new int[count];
            int index = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) factors[index++] = i;
            }
            return factors;
        }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    // Method to find sum of squares of factors
    public static int sumOfSquareOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += Math.pow(factor, 2);
        return sum;
    }
}



