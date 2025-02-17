import java.util.*;
public class quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number ");
        int num1 = sc.nextInt();
        System.out.println("enter second number ");
        int num2 = sc.nextInt();
        int quotient1 =  num1/num2;
        int remainder = num1%num2;
        System.out.println("The Quotient is "+quotient1+" and Reminder is "+remainder+" of two number "+num1 +" and "+ num2);

    }
}
