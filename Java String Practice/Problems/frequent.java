import java.util.*;
class frequent{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = obj.nextLine();
       int[] freq = new int[256]; // for all ASCII characters
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char mostFrequent = ' ';
        int maxCount = -1;

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + mostFrequent);
        }}