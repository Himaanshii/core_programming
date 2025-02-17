//Create a program to convert distance in kilometers to miles.
import java.util.*;
public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometer = sc.nextDouble();
        System.out.println("The total miles is " + (kilometer / 1.6) + " mile for the given " + kilometer + " km");
    }
    
}
