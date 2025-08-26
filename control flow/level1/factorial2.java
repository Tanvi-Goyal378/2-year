import java.util.*;
class factorial2
{
    public static void main(String[] args)
    {
        int facto=1;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num =obj.nextInt();
        for(int n=num;n>0;n--)
        {
            facto*=n;
        }
        System.out.println("Factorial of number "+num+" is "+facto);
    }
}