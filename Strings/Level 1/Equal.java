import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        boolean areSame = true;

        if (first.length() != second.length()) {
            areSame = false;
        } else {
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    areSame = false;
                    break;
                }
            }
        }

        boolean equalsResult = first.equals(second);

        System.out.println("Using charAt: " + areSame);
        System.out.println("Using equals(): " + equalsResult);
    }
}
