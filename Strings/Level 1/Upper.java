import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String manualUpper = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                manualUpper += (char)(c - 32);
            } else {
                manualUpper += c;
            }
        }

        String builtinUpper = text.toUpperCase();

        boolean equal = true;
        if (manualUpper.length() == builtinUpper.length()) {
            for (int i = 0; i < manualUpper.length(); i++) {
                if (manualUpper.charAt(i) != builtinUpper.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        } else {
            equal = false;
        }

        System.out.println("Manual uppercase: " + manualUpper);
        System.out.println("Built-in uppercase: " + builtinUpper);
        System.out.println("Are both equal? " + equal);
    }
}
