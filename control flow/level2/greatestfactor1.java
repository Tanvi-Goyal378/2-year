import java.util.*;
class greatestfactor1{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number");
        int n=obj.nextInt();
        if(n>0){
            System.out.println("Number is positive integer");
        int great=1;
        int i=n-1;
        while(i>=1)
        {
            if(n%i==0){
                great=i;
                break;
                
            }i--;
        }System.out.println("greatest factor of "+n+" is "+great);}
        else
            System.out.println("Number is not positive integer");
    }
}