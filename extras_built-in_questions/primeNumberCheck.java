//Create a program that checks whether a given number is a prime number. ○
//The program should use a separate function to perform the prime check and
//return the result.
import java.util.Scanner;

public class primeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

}
