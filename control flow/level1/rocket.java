import java.util.*;
class rocket
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n = obj.nextInt();
        while(n>=0)
        {
            System.out.println(n);
            n--;
        }
    }

}