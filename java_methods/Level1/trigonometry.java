//Write a program to calculate various trigonometric functions using Math class given an angle in degrees
import java.util.Scanner;
public class trigonometry {
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        
        double angleInRadians = Math.toRadians(angleInDegrees);

        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: "+ results[0]);
        System.out.println("Cosine: "+ results[1]);

         if (Double.isInfinite(results[2])) {
            System.out.println("Tangent: Undefined (infinity)");
        } else {
            System.out.println("Tangent: "+ results[2]);
        }
        
    }
}


        

       