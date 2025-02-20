//Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().

import java.util.Arrays;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

      
        double[] result = findAverageMinMax(numbers);

        double average = result[0];
        int min = (int) result[1];
        int max = (int) result[2];

       
        System.out.println("Generated 4-digit random values: ");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
    }

     public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) numbers[i] = 1000 + new Random().nextInt(9000);
        return numbers;
    }

    // Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = Arrays.stream(numbers).sum();
        int min = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        return new double[]{sum / numbers.length, min, max};
    }
}
