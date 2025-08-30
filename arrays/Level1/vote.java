import java.util.*;
class vote{
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
                System.out.println("invalid age");
        
            else if(numbers[i] >=18){
            System.out.println("you are eligible to vote "+numbers[i]);
            }
            else 
            System.out.println("you are not eligible to vote "+numbers[i]);
        }}}
