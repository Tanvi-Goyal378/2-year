import java.util.*;
class multiple{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number");
        int n=obj.nextInt();
        if(n>=0)
        {
            for(int i=100;i>=1;i--)
            {
                if(i%n==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
        else
            System.out.println("number is not positive integer");
    }
}