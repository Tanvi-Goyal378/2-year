import java.util.*;
class Program7{
    static int[] trimIndex(String s){
        int start=0,end=s.length()-1;
        while(start<s.length() && s.charAt(start)==' ') start++;
        while(end>=0 && s.charAt(end)==' ') end--;
        return new int[]{start,end};
    }
    static String sub(String s,int st,int en){
        String r="";
        for(int i=st;i<=en;i++) r+=s.charAt(i);
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] idx=trimIndex(s);
        String r1=sub(s,idx[0],idx[1]);
        String r2=s.trim();
        System.out.println(r1.equals(r2));
    }
}