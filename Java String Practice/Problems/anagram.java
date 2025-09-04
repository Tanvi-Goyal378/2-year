import java.util.*;

class Anagram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = obj.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = obj.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
