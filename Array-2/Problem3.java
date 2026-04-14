// Largest and second largest digit
import java.util.*;
public class Problem3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] d=new int[10];
        int idx=0;
        while(num!=0 && idx<10){
            d[idx++]=num%10;
            num/=10;
        }
        int l=0,s=0;
        for(int i=0;i<idx;i++){
            if(d[i]>l){ s=l; l=d[i]; }
            else if(d[i]>s && d[i]!=l) s=d[i];
        }
        System.out.println(l+" "+s);
    }
}
