import java.util.*;
class power
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter base ");
        int base=obj.nextInt();
        System.out.print("enter power ");
        int power=obj.nextInt();
        int result=1;
        if(base>=0 && power>=0)
        {
            for(int i=1;i<=power;i++)
            {
                result*=base;
            }
            System.out.println("result= "+result);
        }
        else
            System.out.println("number is not positive integer");
            }}