import java.util.Scanner;

public class Frequency {

    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {}
        return length;
    }

    public static char[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int length = findLength(text);

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        boolean[] added = new boolean[256];
        char[][] result = new char[256][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (!added[ch]) {
                result[index][0] = ch;
                result[index][1] = (char)(frequency[ch]);
                added[ch] = true;
                index++;
            }
        }

        char[][] finalResult = new char[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[][] frequencies = findCharacterFrequencies(input);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " = " + (int)frequencies[i][1]);
        }

        scanner.close();
    }
}
