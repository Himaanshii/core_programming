import java.util.Scanner;

public class createSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String string1 = sc.nextLine().trim();
        System.out.println("Enter the starting index of substring ");
        int firstIndex = sc.nextInt();
        System.out.println("Enter the last index + 1 of substring ");
        int secondIndex = sc.nextInt();
        String result1 = findsubString(string1, firstIndex, secondIndex);
        String result2 = string1.substring(firstIndex,secondIndex);
        System.out.println("Substring using substring method "+ result2);
        System.out.println("Substring using method "+result1);
        if(result1.equals(result2)){
            System.out.println("Results are equal");
        }else{
            System.out.println("Results are not equal");
        }

    }

    public static String findsubString(String s1, int firstIndex, int secondIndex){
        StringBuilder result = new StringBuilder();
        for(int i=firstIndex; i<secondIndex; i++){
            result.append(s1.charAt(i));
        }
        return result.toString();
    }
}
