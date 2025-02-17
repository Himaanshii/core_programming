//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
import java.util.*;

public class youngest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's age and height: ");
        int age1 = input.nextInt();
        double height1 = input.nextDouble();
        System.out.print("Enter Akbar's age and height: ");
        int age2 = input.nextInt();
        double height2 = input.nextDouble();
        System.out.print("Enter Anthony's age and height: ");
        int age3 = input.nextInt();
        double height3 = input.nextDouble();

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        double tallestHeight = Math.max(height1, Math.max(height2, height3));

        String youngest = (youngestAge == age1) ? "Amar" : (youngestAge == age2) ? "Akbar" : "Anthony";
        String tallest = (tallestHeight == height1) ? "Amar" : (tallestHeight == height2) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
