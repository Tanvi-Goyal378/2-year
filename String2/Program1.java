import java.util.*;
class Program1{
    static int myLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch(Exception e){}
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(myLength(s)+" "+s.length());
    }
}