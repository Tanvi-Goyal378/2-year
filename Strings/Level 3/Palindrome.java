import java.util.Scanner;

public class Palindrome {

    // Logic 1: Iterative check using indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper for Logic 3: Reverse string using charAt()
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        return reversed;
    }

    // Logic 3: Palindrome check using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check palindrome: ");
        String input = scanner.nextLine();

        boolean iterativeResult = isPalindromeIterative(input);
        boolean recursiveResult = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean arrayResult = isPalindromeUsingArrays(input);

        System.out.println("Palindrome check results:");
        System.out.println("Iterative method: " + (iterativeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive method: " + (recursiveResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using char array reversal: " + (arrayResult ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}
