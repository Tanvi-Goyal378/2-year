import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
        int facto=1;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num =obj.nextInt();
        int n=num;
        while(n!=0)
        {
            facto*=n;
            n--;
        }
        System.out.println("Factorial of number "+num+" is "+facto);
    }
}