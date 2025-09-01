import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = "";
        for (int i = start; i < end; i++) {
            sub1 = sub1 + text.charAt(i);
        }

        String sub2 = text.substring(start, end);

        boolean same = true;
        if (sub1.length() != sub2.length()) {
            same = false;
        } else {
            for (int i = 0; i < sub1.length(); i++) {
                if (sub1.charAt(i) != sub2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("Substring using charAt: " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Are both substrings same: " + same);
    }
}
