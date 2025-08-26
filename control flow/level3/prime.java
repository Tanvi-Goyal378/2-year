import java.util.*;
class prime{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("enter number");
        int num=obj.nextInt();
        boolean isprime=true;
        if(num<=1){
            isprime=false;
        }else{
            for(int i=2;i<num;i++)
            {
                if (num%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}