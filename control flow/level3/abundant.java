import java.util.*;
class abundant{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
            if(num%i==0)
                sum+=i;
        if(sum>num)
        System.out.println("Abundant number");
        else
            System.out.println("not an anundant number");}}
        