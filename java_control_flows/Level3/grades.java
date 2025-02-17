//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade 
import java.util.*;

public class grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        int total = physics + chemistry + maths;
        double percentage = (total / 3.0);
        System.out.println("Average Marks: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (percentage >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (percentage >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (percentage >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (percentage >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}
