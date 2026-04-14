import java.util.Scanner;
class Program2 {
    static String substring(String s,int start,int end){
        String res="";
        for(int i=start;i<end;i++){
            res+=s.charAt(i);
        }
        return res;
    }
    static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int st=sc.nextInt();
        int en=sc.nextInt();
        String r1=substring(s,st,en);
        String r2=s.substring(st,en);
        System.out.println(compare(r1,r2));
    }
}