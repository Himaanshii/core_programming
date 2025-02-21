import java.util.Scanner;

public class trimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();
        
        String manuallyTrimmed = manualTrim(input);
        String builtInTrimmed = input.trim();
        boolean isSame = compareStrings(manuallyTrimmed, builtInTrimmed);
        System.out.println("Manually Trimmed String: \"" + manuallyTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both trims the same? " + isSame);
    }

    // Method to find the first and last non-space index
    public static int[] findTrimIndexes(String s) {
        int start = 0, end = s.length() - 1;

        // Find first non-space character
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end > start && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to extract a substring manually using charAt()
    public static String substringUsingCharAt(String s, int start, int end) {
        StringBuilder trimmedString = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedString.append(s.charAt(i));
        }
        return trimmedString.toString();
    }

    // Method to manually trim spaces using charAt()
    public static String manualTrim(String s) {
        int[] indexes = findTrimIndexes(s);
        return substringUsingCharAt(s, indexes[0], indexes[1]);
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
