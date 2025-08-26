import java.util.*;
class greatestfactor{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number");
        int n=obj.nextInt();
        if(n>0){
            System.out.println("Number is positive integer");
        int great=1;
        for (int i=1;i<n;i++)
        {
            if(n%i==0){
                if (i>great)
                    great=i;
                
            }
        }System.out.println("greatest factor of "+n+" is "+great);}
        else
            System.out.println("Number is not positive integer");
    }
}