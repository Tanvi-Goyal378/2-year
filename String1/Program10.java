import java.util.Scanner;
class Program10 {
    static String lower(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z') c=(char)(c+32);
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
        String r1=lower(s);
        String r2=s.toLowerCase();
        System.out.println(compare(r1,r2));
    }
}