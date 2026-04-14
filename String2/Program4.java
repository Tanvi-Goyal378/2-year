import java.util.*;
class Program4{
    static String[] splitWords(String s){
        return s.split(" ");
    }
    static int myLength(String s){ return s.length(); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] w=splitWords(s);
        String min=w[0],max=w[0];
        for(String x:w){
            if(x.length()<min.length()) min=x;
            if(x.length()>max.length()) max=x;
        }
        System.out.println("Shortest:"+min);
        System.out.println("Longest:"+max);
    }
}