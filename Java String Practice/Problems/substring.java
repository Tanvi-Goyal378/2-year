import java.util.*;
class substring{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = obj.nextLine();
        System.out.print("Enter a Substring: ");
        String substr = obj.nextLine();
        int c=0;
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].equals(substr))
                c++;
        }
            System.out.println("count of substring: "+c);}}