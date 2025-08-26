import java.util.*;
class natural{
    public static void main(String[] args){
        System.out.print("Enter a number= ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if (n>=0){
            System.out.println(n+" is the natural number");
            int sum=n*(n+1)/2;
            System.out.println("sum of the natural number is "+sum);
        }
        else{
            System.out.println(n+"is not natural number");
            
        }
    }
}