import java.util.Scanner;

public class Split3 {
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

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i == spaceCount) ? length : spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        String[][] wordWithLength = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            wordWithLength[i][0] = words[i];
            int wLen = 0;
            while (true) {
                try {
                    words[i].charAt(wLen);
                    wLen++;
                } catch (Exception e) {
                    break;
                }
            }
            wordWithLength[i][1] = String.valueOf(wLen);
        }

        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordWithLength[0][1]);
        int longestLength = Integer.parseInt(wordWithLength[0][1]);

        for (int i = 1; i < wordCount; i++) {
            int currentLen = Integer.parseInt(wordWithLength[i][1]);
            if (currentLen < shortestLength) {
                shortestLength = currentLen;
                shortestIndex = i;
            }
            if (currentLen > longestLength) {
                longestLength = currentLen;
                longestIndex = i;
            }
        }

        System.out.println("Shortest word: " + wordWithLength[shortestIndex][0] + " Length: " + shortestLength);
        System.out.println("Longest word: " + wordWithLength[longestIndex][0] + " Length: " + longestLength);
    }
}
