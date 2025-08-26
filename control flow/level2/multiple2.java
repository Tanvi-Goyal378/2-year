import java.util.*;
class multiple2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number");
        int n=obj.nextInt();
        if(n>=0)
        {
            int i=100;
            while(i>=1)
            {
                if(i%n==0)
                {
                    System.out.print(i+" ");
                }
            i--;}
        }
        else
            System.out.println("number is not positive integer");
    }
}