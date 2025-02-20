//Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
import java.util.*;
public class generateOTP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unique OTPs: " + generateUniqueOTPs());

    }
    // Generate a 6-digit unique OTP
    public static Set<Integer> generateUniqueOTPs() {
        Set<Integer> otps = new HashSet<>();
        Random rand = new Random();
        while (otps.size() < 10) {
            otps.add(100000 + rand.nextInt(900000));
        }
        return otps;
    }
}