import java.util.*;
class armstrong{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number");
        int num=obj.nextInt();
        int sum=0;
        int originalnumber=num;
        while(originalnumber!=0){
            int digit =originalnumber%10;
            sum+=digit*digit*digit;
            originalnumber/=10;
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number");
        }
        else
            System.out.println(num+" is not an armstrong number");
    }
}