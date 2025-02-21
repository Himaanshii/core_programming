import java.util.Scanner;

public class charInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String input = sc.nextLine();
        char[] result1 = arrayOfCharacters(input);
        char[] result2 = input.toCharArray();
        boolean finalresult = compareArrays(result1, result2);

        System.out.print("Result using Buil-in Function ");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]+" ");
        }
        System.out.println();
        System.out.print("Result using Method ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]+" ");
        }
        System.out.println();
        if(finalresult){
            System.out.println("Both methods gives the same result ");
        }else{
            System.out.println("Both methods doesn't give the same result ");
        }
        
    }

    // Create array of characters in a string 
    public static char[] arrayOfCharacters(String s){
        char[] arr = new char[s.length()];
        for(int i=0 ;i<s.length(); i++){
            arr[i] = s.charAt(i);
        } 
        return arr;
    }

    // create a method to comapre two char arrays
    public static boolean compareArrays(char[] arr1 , char[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }

        }
        return true;
    }
}
