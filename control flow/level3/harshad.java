import java.util.*;
class harshad{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0;
        int temp=num;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        if(num%sum==0)
            System.out.println("Harshad number");
        else
            System.out.println("not a harshad number");
    }
}