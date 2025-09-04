import java.util.*;

class compare {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = obj.nextLine();
        System.out.print("Enter second string: ");
        String str2 = obj.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        boolean decided = false;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
                decided = true;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
                decided = true;
                break;
            }
        }

        if (!decided) { // no difference found in compared part
            if (str1.length() == str2.length()) {
                System.out.println("Both strings are same");
            } else if (str1.length() < str2.length()) {
                System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
            } else {
                System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
            }
        }
    }
}
