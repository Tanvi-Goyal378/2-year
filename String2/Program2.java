import java.util.*;
class Program2{
    static String[] splitWords(String s){
        ArrayList<String> list=new ArrayList<>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') word+=s.charAt(i);
            else{
                if(!word.equals("")) list.add(word);
                word="";
            }
        }
        if(!word.equals("")) list.add(word);
        return list.toArray(new String[0]);
    }
    static boolean compare(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=splitWords(s);
        String[] b=s.split(" ");
        System.out.println(compare(a,b));
    }
}