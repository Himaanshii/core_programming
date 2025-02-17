//Rework the program largest, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
import java.util.*;
public class largestDynamic{
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int number7 = scanner.nextInt();
  
          int maxDigit = 10;
          int[] digits1 = new int[maxDigit];
          int index2 = 0;
  
          while (number7 != 0) {
              if (index2 == maxDigit) {
                  maxDigit += 10;
                  int[] temp = new int[maxDigit];
                  System.arraycopy(digits1, 0, temp, 0, digits1.length);
                  digits1 = temp;
              }
              digits1[index2++] = number7 % 10;
              number7 /= 10;
          }
  
          if (index2 == 0) {
              System.out.println("No digits entered.");
              return;
          }
  
          int largest1 = digits1[0], secondLargest1 = -1;
  
          for (int i = 1; i < index2; i++) {
              if (digits1[i] > largest1) {
                  secondLargest1 = largest1;
                  largest1 = digits1[i];
              } else if (digits1[i] > secondLargest1 && digits1[i] != largest1) {
                  secondLargest1 = digits1[i];
              }
          }
  
          System.out.println("Largest Digit: " + largest1);
          System.out.println("Second Largest Digit: " + (secondLargest1 == -1 ? "Not available" : secondLargest1));
    }
}
 