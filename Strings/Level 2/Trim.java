import java.util.Scanner;

public class Trim {

    public static int[] trimIndexes(String str) {
        int start = 0;
        int end = 0;

        int length = 0;
        while (true) {
            try {
                str.charAt(length);
                length++;
            } catch (Exception e) {
                break;
            }
        }

        // find first non-space from start
        for (start = 0; start < length; start++) {
            if (str.charAt(start) != ' ') {
                break;
            }
        }

        // find first non-space from end
        for (end = length - 1; end >= start; end--) {
            if (str.charAt(end) != ' ') {
                break;
            }
        }

        return new int[]{start, end};
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        int len1 = 0;
        while (true) {
            try {
                s1.charAt(len1);
                len1++;
            } catch (Exception e) {
                break;
            }
        }

        int len2 = 0;
        while (true) {
            try {
                s2.charAt(len2);
                len2++;
            } catch (Exception e) {
                break;
            }
        }

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);
        String trimmedByMethod = substringUsingCharAt(text, indexes[0], indexes[1]);
        String trimmedByBuiltIn = text.trim();

        boolean areSame = compareStringsUsingCharAt(trimmedByMethod, trimmedByBuiltIn);

        System.out.println("Trimmed by method: \"" + trimmedByMethod + "\"");
        System.out.println("Trimmed by built-in: \"" + trimmedByBuiltIn + "\"");
        System.out.println("Are both trimmed strings same? " + areSame);
    }
}
