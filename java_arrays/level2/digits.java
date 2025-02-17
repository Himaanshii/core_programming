import java.util.*;
public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDigit = 10;
        int[] digit = new int[maxDigit];
       int i=0;
        while(n>0 && i<maxDigit){
            digit[i] = n%10;
            n=n/10;
            i++;
            
        }
        System.out.println("Digit Array ");
        for (int j = 0; j < i; j++) {
            System.out.print(digit[j]+" ");
        }
        int largest = digit[1];
        int secondLargest = digit[0];
        for (int j = 2; j < digit.length; j++) {
            if(digit[j]> largest){
                secondLargest = largest;
                largest = digit[j];
                
            }
        }
        System.out.println("Largest Digit is " +largest);
        System.out.println("second Largest Digit is "+ secondLargest);
    }
}
