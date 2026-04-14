import java.util.*;
class Program5{
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
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            String t=type(s.charAt(i));
            if(t.equals("Vowel")) v++;
            if(t.equals("Consonant")) c++;
        }
        System.out.println(v+" "+c);
    }
}