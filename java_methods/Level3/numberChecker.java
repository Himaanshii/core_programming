/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable. */

import java.util.Arrays;

public class numberChecker {
    public static void main(String[] args) {
        int number = 21; // Test number (You can change this value)

        // Count the number of digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store digits in an array
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Sum of digits
        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Sum of squares of digits
        int sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Frequency of each digit
        int[][] digitFrequency = digitFrequency(digits);
        System.out.println("Digit Frequency: ");
        for (int[] freq : digitFrequency) {
            System.out.println("Digit " + freq[0] + " appears " + freq[1] + " times.");
        }

        // Reverse digits
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        // Check if number is palindrome
        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + isPalindrome);

        // Check if number is a Duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if number is prime
        boolean isPrime = isPrime(number);
        System.out.println("Is Prime: " + isPrime);

        // Check if number is a Neon number
        boolean isNeon = isNeon(number);
        System.out.println("Is Neon Number: " + isNeon);

        // Check if number is a Spy number
        boolean isSpy = isSpy(number);
        System.out.println("Is Spy Number: " + isSpy);

        // Check if number is an Automorphic number
        boolean isAutomorphic = isAutomorphic(number);
        System.out.println("Is Automorphic Number: " + isAutomorphic);

        // Check if number is a Buzz number
        boolean isBuzz = isBuzz(number);
        System.out.println("Is Buzz Number: " + isBuzz);

        // Find the factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Greatest factor
        int greatestFactor = greatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Sum of factors
        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        // Product of factors
        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        // Product of cubes of the factors
        double productOfCubes = productOfCubes(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        // Check if number is a Perfect number
        boolean isPerfect = isPerfect(number);
        System.out.println("Is Perfect Number: " + isPerfect);

        // Check if number is an Abundant number
        boolean isAbundant = isAbundant(number);
        System.out.println("Is Abundant Number: " + isAbundant);

        // Check if number is a Deficient number
        boolean isDeficient = isDeficient(number);
        System.out.println("Is Deficient Number: " + isDeficient);

        // Check if number is a Strong number
        boolean isStrong = isStrong(number);
        System.out.println("Is Strong Number: " + isStrong);
    }

    // Count number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits of a number in an array
    public static int[] getDigits(int num) {
        return Integer.toString(num).chars().map(c -> c - '0').toArray();
    }

    // Check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        return String.valueOf(num).contains("0");
    }

    // Check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int sum = Arrays.stream(digits).map(d -> (int) Math.pow(d, digits.length)).sum();
        return sum == num;
    }

     // Find the largest and second largest digit
     public static int[] largestTwoDigits(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    // Find the smallest and second smallest digits
    public static int[] smallestTwoDigits(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

     // Sum of digits
     public static int sumOfDigits(int[] digits) {
        return Arrays.stream(digits).sum();
    }

    // Sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        return Arrays.stream(digits).map(d -> (int) Math.pow(d, 2)).sum();
    }

    // Check if a number is a Harshad number
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sumOfDigits = sumOfDigits(digits);
        return num % sumOfDigits == 0;
    }

    // Find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[] frequency = new int[10]; // Digits 0-9
        for (int digit : digits) {
            frequency[digit]++;
        }
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = frequency[i];
        }
        return result;
    }

    // Reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Check if the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return Arrays.equals(digits, reversed);
    }

     // Check if a number is a Duck number
     public static boolean isDuckNumber(int[] digits) {
        return Arrays.stream(digits).anyMatch(d -> d == 0) && digits[0] != 0;
    }


    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check if a number is a Neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = sumOfDigits(getDigits(square));
        return sum == num;
    }

    // Check if a number is a Spy number
    public static boolean isSpy(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(digits);
        int product = Arrays.stream(digits).reduce(1, (a, b) -> a * b);
        return sum == product;
    }

    // Check if a number is an Automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    // Check if a number is a Buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || String.valueOf(num).endsWith("7");
    }

     // Find the factors of a number
     public static int[] findFactors(int num) {
        int[] temp = new int[num / 2];
        int index = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                temp[index++] = i;
            }
        }
        return Arrays.copyOf(temp, index);
    }

    // Find the greatest factor
    public static int greatestFactor(int[] factors) {
        return Arrays.stream(factors).max().orElse(Integer.MIN_VALUE);
    }

    // Sum of the factors
    public static int sumOfFactors(int[] factors) {
        return Arrays.stream(factors).sum();
    }

    // Product of the factors
    public static int productOfFactors(int[] factors) {
        return Arrays.stream(factors).reduce(1, (a, b) -> a * b);
    }

    // Product of cubes of the factors
    public static double productOfCubes(int[] factors) {
        return Arrays.stream(factors).mapToDouble(f -> Math.pow(f, 3)).reduce(1, (a, b) -> a * b);
    }

    // Check if a number is a Perfect number
    public static boolean isPerfect(int num) {
        int[] factors = findFactors(num);
        return sumOfFactors(factors) == num;
    }

    // Check if a number is an Abundant number
    public static boolean isAbundant(int num) {
        int[] factors = findFactors(num);
        return sumOfFactors(factors) > num;
    }

    // Check if a number is a Deficient number
    public static boolean isDeficient(int num) {
        int[] factors = findFactors(num);
        return sumOfFactors(factors) < num;
    }

    // Check if a number is a Strong number
    public static boolean isStrong(int num) {
        int[] digits = getDigits(num);
        int sumOfFactorials = Arrays.stream(digits)
            .map(d -> factorial(d))
            .sum();
        return sumOfFactorials == num;
    }

    //Helper method to calculate factorial of a number
    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;

}
}
