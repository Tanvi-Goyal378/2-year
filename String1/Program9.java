import java.util.Scanner;
class Program9 {
    static String upper(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z') c=(char)(c-32);
            res+=c;
        }
        return res;
    }
    static boolean compare(String a,String b){
        return a.equals(b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r1=upper(s);
        String r2=s.toUpperCase();
        System.out.println(compare(r1,r2));
    }
}