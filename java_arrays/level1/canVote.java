//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
import java.util.*;

import java.util.Scanner;

public class canVote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for(int i =0; i<10; i++){
            age[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++){
            if(age[i] <0){
            System.out.println("Invalid Age");  
            }
            if(age[i]>=18){
                System.out.println("The studnet with age " + age[i] + " can vote. ");
            }else{
                System.out.println("the student with the age " + age[i] +"can't vote.");
            }
        }
    }
}