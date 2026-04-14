import java.util.*;
class Program7{
    static boolean check(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    static boolean rec(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return rec(s,i+1,j-1);
    }
    static String rev(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--) r+=s.charAt(i);
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(check(s));
        System.out.println(rec(s,0,s.length()-1));
        System.out.println(s.equals(rev(s)));
    }
}