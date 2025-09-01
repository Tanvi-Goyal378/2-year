import java.util.Scanner;

public class Vowel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int length = 0;
        while (true) {
            try {
                text.charAt(length);
                length++;
            } catch (Exception e) {
                break;
            }
        }

        System.out.println("Character\tType");

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            char lower;
            if (c >= 'A' && c <= 'Z') {
                lower = (char)(c + 32);
            } else {
                lower = c;
            }

            String type;

            if (lower >= 'a' && lower <= 'z') {
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    type = "Vowel";
                } else {
                    type = "Consonant";
                }
            } else {
                type = "Not a Letter";
            }

            System.out.println(c + "\t\t" + type);
        }
    }
}
