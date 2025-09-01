import java.util.Scanner;

public class NonRepeating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[] frequency = new int[256];
        int length = 0;

        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {}

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        char result = '\0';
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
