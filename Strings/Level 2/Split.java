import java.util.Scanner;

public class Split {
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

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;

        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx] = i;
                idx++;
            }
        }

        String[] manualWords = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i == spaceCount) {
                end = length;
            } else {
                end = spaceIndexes[i];
            }
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            manualWords[i] = word;
            start = end + 1;
        }

        String[] builtinWords = text.split(" ");

        boolean equal = true;
        if (manualWords.length != builtinWords.length) {
            equal = false;
        } else {
            for (int i = 0; i < manualWords.length; i++) {
                if (!manualWords[i].equals(builtinWords[i])) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println("Manual split words:");
        for (String w : manualWords) {
            System.out.println(w);
        }

        System.out.println("Built-in split words:");
        for (String w : builtinWords) {
            System.out.println(w);
        }

        System.out.println("Are both splits equal? " + equal);
    }
}
