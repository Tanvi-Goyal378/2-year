import java.util.*;
class factor1{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number");
        int n=obj.nextInt();
        if(n>0){
            System.out.println("Number is positive integer");
        int i=1;
        while(i<=n)
        {
            if(n%i==0){
                System.out.print(i+" ");
            }
        i++;}}
        else
            System.out.println("Number is not positive integer");
    }
}