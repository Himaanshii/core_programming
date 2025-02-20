//Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it

import java.util.Arrays;
import java.util.Scanner;

public class youngest {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextInt();
        }
        
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);
        
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
    // Method to find youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = Arrays.stream(ages).min().orElse(Integer.MAX_VALUE);
        int index = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] == minAge) {
                index = i;
                break;
            }
        }
        return names[index];
    }

    // Method to find tallest friend
    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = Arrays.stream(heights).max().orElse(Integer.MIN_VALUE);
        int index = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] == maxHeight) {
                index = i;
                break;
            }
        }
        return names[index];
    }
}
