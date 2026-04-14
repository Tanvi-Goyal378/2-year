// Digit frequency
import java.util.*;
public class Problem10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] freq=new int[10];

        while(num!=0){
            int d=num%10;
            freq[d]++;
            num/=10;
        }

        for(int i=0;i<10;i++){
            System.out.println(i+" -> "+freq[i]);
        }
    }
}
