import java.util.*;
class table2
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number ");
        int num=obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}