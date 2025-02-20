//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
import java.util.*;

public class springSeason {
    public static boolean isSpringSeason(int month, int date){
        if(month == 3 && date >= 20 && date<=31 ){
            return true;
        } if(month == 4 && date >= 1 && date<=30 ){
            return true;
        } if(month == 5 && date >= 1 && date<=31 ){
            return true;
        }else if(month == 6 && date>=1 && date<= 20 ){
            return true;
        }
            return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(args.length < 2){
            System.out.println("Please provide both month and day ");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(isSpringSeason(a, b)){
            System.out.println("It's Spring season");
        }else{
            System.out.println("Not a spring season");
        }

    }
}
