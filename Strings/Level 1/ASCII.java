import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String manualLower = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                manualLower += (char)(c + 32);
            } else {
                manualLower += c;
            }
        }

        String builtinLower = text.toLowerCase();

        boolean equal = true;
        if (manualLower.length() != builtinLower.length()) {
            equal = false;
        } else {
            for (int i = 0; i < manualLower.length(); i++) {
                if (manualLower.charAt(i) != builtinLower.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println(manualLower);
        System.out.println(builtinLower);
        System.out.println(equal);
    }
}
