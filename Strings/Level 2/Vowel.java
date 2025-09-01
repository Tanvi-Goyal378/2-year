import java.util.Scanner;

public class Vowel {
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

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            char lower;
            if (c >= 'A' && c <= 'Z') {
                lower = (char)(c + 32);
            } else {
                lower = c;
            }

            if (lower >= 'a' && lower <= 'z') {
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
