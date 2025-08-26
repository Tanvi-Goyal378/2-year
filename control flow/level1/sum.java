import java.util.*;
class sum
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        double n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        n = obj.nextDouble();
        while(n!=0)
        {
            sum+=n;
            System.out.println("Enter number");
            n = obj.nextDouble();
        }
        System.out.println("sum of number you enter is "+sum);
    }
}