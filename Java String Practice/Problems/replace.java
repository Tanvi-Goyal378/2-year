import java.util.*;

class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = obj.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = obj.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = obj.nextLine();

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated sentence: " + result);
    }
}
