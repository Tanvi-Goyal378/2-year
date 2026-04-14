import java.util.*;
class Program5{
    static char[] unique(String s){
        char[] temp=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){ flag=false; break; }
            }
            if(flag) temp[k++]=s.charAt(i);
        }
        return Arrays.copyOf(temp,k);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] u=unique(s);
        for(char c:u){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c) count++;
            }
            System.out.println(c+" "+count);
        }
    }
}