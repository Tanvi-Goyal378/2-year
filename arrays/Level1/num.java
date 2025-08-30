import java.util.*;
class num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println("enter "+size+" elements: ");
        int i=0;
        for( i=0;i<size;i++){
            numbers[i] =sc.nextInt();
            if(numbers[i] < 0)
                System.out.println("negative number");
        
            else if(numbers[i] >=1){
                System.out.println("positive number");
                if (numbers[i] %2==0)
                    System.out.println("number is even");
                else
                    System.out.println("number is odd");
            }
            else 
            System.out.println("number is zero");
        }
        if (numbers[0] == numbers[size-1])
            System.out.println("last number of array is equal");
        else if (numbers[0] > numbers[size-1])
            System.out.println("first number is greater than last number");
        else
            System.out.println("last number is greater than first number");}}
