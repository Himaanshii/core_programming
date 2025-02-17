//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
import java.util.*;

public class totalPrice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the unit price of the item ");
        int unitPrice = scanner.nextInt();
        System.out.print("Enter the quantity you want to buy ");
        int quantity = scanner.nextInt();
        int totalPrice = unitPrice*quantity;
        System.out.println("The total purchase price is INR "+ totalPrice +" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}
