import java.util.*;
class longest{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = obj.nextLine();

        String[] words = str.split(" ");
        String longest = words[0];

        for(int i=1; i<words.length; i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
