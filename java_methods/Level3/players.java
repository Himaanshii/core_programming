//Create a program to find the shortest, tallest, and mean height of players present in a football team.

import java.util.Arrays;
import java.util.Random;

public class players{
    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Tallest: " + tallestHeight(heights));
        System.out.println("Shortest: " + shortestHeight(heights));
        System.out.println("Mean Height: " + meanHeight(heights));
    }

    // Generate random heights for football team
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }

    // Calculate sum of elements in an array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Calculate mean height
    public static double meanHeight(int[] heights) {
        return (double) sumArray(heights) / heights.length;
    }

    // Find shortest height
    public static int shortestHeight(int[] heights) {
        return Arrays.stream(heights).min().orElse(0);
    }

    // Find tallest height
    public static int tallestHeight(int[] heights) {
        return Arrays.stream(heights).max().orElse(0);
    }
}