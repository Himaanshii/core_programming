//Create a program to find the mean height of players present in a football team.

import java.util.*;
public class meanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;
        System.out.println("Enter the heights of 11 football players:");
        for(int i =0; i<height.length; i++){
            height[i] = sc.nextDouble();
            sum += height[i];
        }
        double mean = sum/height.length;
        System.out.println("Mean Height od the Footbal team is " + mean);
    }
}
