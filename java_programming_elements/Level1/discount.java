//Write a new program similar to the program in fee.java but take user input for Student Fee and University Discount
import java.util.*;
public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student fee: ");
        int studentFee = sc.nextInt();
        System.out.print("Enter discount percent: ");
        int discountRate = sc.nextInt();
        int studentDiscount = (studentFee * discountRate) / 100;
        System.out.println("The discount amount is INR " + studentDiscount + " and final discounted fee is INR " + (studentFee - studentDiscount));
    }
}
