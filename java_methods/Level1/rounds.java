//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
import java.util.*;
public class rounds {
    public int roundsNeeded(int a, int b, int c , int distance){
        int perimeter = a+b+c;
        return distance/perimeter;
    }
    public static void main(String[] args) {
        rounds rs = new rounds();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle in meters ");
        int a = sc.nextInt();
        System.out.println("Enter second side of triangle in meters ");
        int b = sc.nextInt();
        System.out.println("Enter third side of triangle in meters ");
        int c = sc.nextInt();
        int answer = rs.roundsNeeded(a, b, c, 5000);
        System.out.println(" Number of rounds completed will be "+answer);
    }
}
