// Dynamic array for digits
import java.util.*;
public class Problem4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=10, idx=0;
        int[] d=new int[max];

        while(num!=0){
            if(idx==max){
                max+=10;
                int[] temp=new int[max];
                for(int i=0;i<d.length;i++) temp[i]=d[i];
                d=temp;
            }
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
