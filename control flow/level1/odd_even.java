import java.util.*;
class odd_even
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number= ");
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        if (num>=0)
            System.out.println("Its a natural number");
        for(int n=0;n<=num;n++)
        {
            if(n%2==0)
                System.out.println(n+"=even");
           else
                System.out.println(n+"=odd");
        }
    }
}