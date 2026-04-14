import java.util.*;
class Program6{
    static String type(char c){
        if(c>='A'&&c<='Z') c=(char)(c+32);
        if(c>='a'&&c<='z'){
            if("aeiou".indexOf(c)>=0) return "Vowel";
            else return "Consonant";
        }
        return "Not Letter";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i)+" "+type(s.charAt(i)));
        }
    }
}