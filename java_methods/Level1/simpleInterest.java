//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.*;
class simpleInterest{
    public double interest(double a,double b,double c){
        return((a*b*c)/100);
    }

public static void main(String[] args) {
    simpleInterest si = new simpleInterest();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principal amount ");
    double a = sc.nextDouble();
    System.out.println("Enter rate of Interest ");
    double b = sc.nextDouble();
    System.out.println("Enter time ");
    double c = sc.nextDouble();
    double d = si.interest(a,b,c);
    System.out.println("The Simple Interest is "+d+" for principal "+a+" Rate of Interest "+b+" and Time "+c);
}
}