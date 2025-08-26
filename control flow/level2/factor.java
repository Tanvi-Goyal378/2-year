import java.util.*;
class factor{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number");
        int n=obj.nextInt();
        if(n>0){
            System.out.println("Number is positive integer");
        for (int i=1;i<=n;i++)
        {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }}
        else
            System.out.println("Number is not positive integer");
    }
}