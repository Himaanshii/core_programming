// Create a program to find the maximum number of handshakes among N number of students.
import java.util.*;
public class handshakes {
    public int formulae(int n){
        return (n*(n-1)/2);
    }
    public static void main(String[] args) {
        handshakes hs  = new handshakes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students ");
        int a = sc.nextInt();
        int b = hs.formulae(a);
        System.out.println("Number of handshakes will be "+b);
    }
}
