// Reverse number using array
import java.util.*;
public class Problem5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,count=0;
        while(temp!=0){ count++; temp/=10; }

        int[] d=new int[count];
        temp=num;
        for(int i=0;i<count;i++){
            d[i]=temp%10;
            temp/=10;
        }

        for(int i=0;i<count;i++) System.out.print(d[i]);
    }
}
